package com.example.bank_side_server.service.Impl;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FirmInqBeneReqLayer;
import com.example.bank_side_server.service.BankSideService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

@Service
public class BankSideServiceImpl implements BankSideService {

    @Value("${bank.ip}")
    private String ip;

    @Value("${bank.port}")
    private int port;

    @Value("${bank.timeout}")
    private int timeout;

    @Value("${bank.charset}")
    private String charset;

    @Value("${bank.name}")
    private String bankname;

//    @Autowired
//    private OrgApiTcpUtil orgApiTcpUtil;
    @Autowired
    private PostsCallerImpl postsCaller;

    private String jsonStr;

    private String xmlStr;
    private FirmInqBeneRepLayer rep;
    private static final String  CONTENT_TYPE_JSON= "application/json";
    private static final String  CONTENT_TYPE_XML= "application/soap+xml";
    @Override
    public FirmInqBeneRepLayer execInquireBeneficiary(FirmInqBeneReqLayer req) throws Exception {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JAXBContext jaxbContext = JAXBContext.newInstance(FirmInqBeneReqLayer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter stringWriter = new StringWriter();
            if(bankname.equals("BIDV")){
                jaxbMarshaller.marshal(req, stringWriter);
                String xmlContent = stringWriter.toString();
                System.out.println(xmlContent);
                rep = postsCaller.getBeneficiary(CONTENT_TYPE_XML, xmlContent);
            }else {
                jsonStr = mapper.writeValueAsString(req);
                System.out.println(jsonStr);
//            jsonString = String.valueOf(req);
//            msg = orgApiTcpUtil.tcpTransfer(ip, port, timeout, charset, inqBeneString);
//            rep = postsCaller.getBeneficiary(CONTENT_TYPE_JSON, jsonStr);
                rep = postsCaller.getBeneficiary(CONTENT_TYPE_JSON, jsonStr);
            }
//            String msg = null;
//            String inqBeneString = req.toString();
//            System.out.println("inqBeneString : " + inqBeneString);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return rep;
    }
}
