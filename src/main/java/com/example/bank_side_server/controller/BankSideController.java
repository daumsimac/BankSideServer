package com.example.bank_side_server.controller;

import com.example.bank_side_server.constants.ApiRestURIConstants;
import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FirmInqBeneReqLayer;
import com.example.bank_side_server.service.BankSideService;
import com.example.bank_side_server.validate.ApiReqInqBeneValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankSideController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ApiReqInqBeneValidate apiReqInqBeneValidate;
    @Autowired
    BankSideService bankSideService;

    /**
     * 예금주조회 api 요청
     *
     * @return JSON
     */
    @RequestMapping(value = ApiRestURIConstants.INQUIRE_BENE_URI, method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> inquire(@RequestBody FirmInqBeneReqLayer req, BindingResult bindingResult){
        FirmInqBeneRepLayer rep = null;

        try{
            apiReqInqBeneValidate.validate(req, bindingResult);

            if (bindingResult.hasErrors()) {
                FieldError error = bindingResult.getFieldError();

                this.logger.error(req.toString() + "[" + error.getDefaultMessage() + "]");

                rep = new FirmInqBeneRepLayer();

                rep.setStatus(400);
                rep.setBusinessErrorCode(error.getCode());
                rep.setBusinessErrorDesc(error.getDefaultMessage());

                return ResponseEntity.status(400).
                        header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
            }

            rep = this.bankSideService.execInquireBeneficiary(req);
        }catch (Exception e) {
            this.logger.error("OrgApiController error.", e);

            //시스템 에러
            rep = new FirmInqBeneRepLayer();

            rep.setStatus(500);
            rep.setBusinessErrorCode("9999");
            rep.setBusinessErrorDesc("서버에러");

            return ResponseEntity.status(500).
                    header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
        }
        return ResponseEntity.status(rep.getStatus()).
                header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).body(rep);
    }
}
