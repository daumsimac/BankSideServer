package com.example.bank_side_server.constants;

public class ApiRestURIConstants {

    /**
     * 예금주 조회
     * - 예금주조회를 통해 계좌주명을 조회
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRE_BENE_URI = "/bank/v1/inquireBeneficiary";

    /**
     * 송금
     * - 입금은행의 계좌번호로 송금 요청
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String FUND_TRANSFER = "/bank/v1/fundTransfer";

    /**
     * 이체 확인
     * - 송금, 출금 발생 거래건에 대한 이체 처리여부 조회
     * - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INVESTIGATE = "/bank/v1/investigate";

    /**
     * OTP 요청
     * - OTP 정보 확인 요청 전문
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String REQUEST_OTP = "/bank/v1/requestOTP";

    /**
     * 카드번호 아이디 변환(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CONVERT_CARDNUMBER_ID = "/bank/v1/convertCardNumberToId";

    /**
     * 은행 목록 획득(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String GET_BANK_LIST = "/bank/v1/getBankList";

    /**
     * 토큰 획득(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String GET_TOKEN = "/bank/v1/getToken";

    /**
     * 월렛 링크(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String WALLET_LINK = "/bank/v1/walletLink";

    /**
     * 월렛 정보(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String WALLET_INFO = "/bank/v1/walletInformation";

    /**
     * 연결 취소(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CANCEL_CONN = "/bank/v1/cancelConnection";

    /**
     * 캐쉬 출금(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CASH_OUT = "/bank/v1/cashOut";

    /**
     * 출금 발송 요청 - 캐쉬 충전?(가칭)
     * - 고객계좌에서 출금해오는 업무
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String CASH_IN = "/bank/v1/cashIn";

    /**
     * 잔액 조회(가칭)
     * - 고객계좌에서 잔액을 조회하는 업무
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRY_BALANCE = "/bank/v1/inquiryBalance";

    /**
     * 지불(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String PAYMENT = "/bank/v1/payment";

    /**
     * 환불(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String REFUND_ORIGINAL_TRANSACTION = "/bank/v1/refundForOriginalTransaction";

    /**
     * 한도 증가(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String UPGRADE_TRANSACTION_LIMIT = "/bank/v1/upgradeTransactionLimit";

    /**
     * 월렛 소유주 확인(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String VERIFY_WALLET_OWNER = "/bank/v1/verifyWalletOwner";

    /**
     * 월렛 아이디 확인(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String VERIFY_ID_CARD = "/bank/v1/verifyIdCard";

    /**
     * 계좌 조회(가칭)
     * -
     * - POST - 헤더 5자리포함(Ex> 00500) + JSON Body
     */
    public static final String INQUIRY_ACCOUNT = "/bank/v1/inquiryAccount";
}
