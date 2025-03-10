package com.payment.simulator.common.exception;

import com.payment.simulator.common.dto.BaseDto;
import com.payment.simulator.common.enums.PaymentSystem;

/**
 * 系统错误
 */

public class PaymentError extends BaseDto {
    private String code;
    private String msg;
    private String systemId;

    public PaymentError(String code, String msg, String systemId){
        this.code = code;
        this.msg = msg;
        this.systemId = systemId;
    }

    public PaymentError(){

    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SimulateException toPaymentException(){
        return new SimulateException(ErrorCode.getErrorCodeByCode(this.code), this.msg, PaymentSystem.getPaymentSystemById(this.systemId));
    }

}
