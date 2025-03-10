package com.payment.simulator.common.exception;

import com.payment.simulator.common.enums.PaymentSystem;

public class SimulateException extends RuntimeException{
    private String internalMessage = "";
    private ErrorCode errorCode = null;
    private PaymentSystem system = null;

    public SimulateException(ErrorCode errorCode, String internalMessage, PaymentSystem system, Exception exception){
        super(exception);
        this.internalMessage = internalMessage;
        this.system=system;
        this.errorCode = errorCode;
    }

    public SimulateException(ErrorCode errorCode, String internalMessage, PaymentSystem system){
        super(internalMessage);
        this.internalMessage = internalMessage;
        this.errorCode = errorCode;
        this.system=system;
    }

    public SimulateException(ErrorCode errorCode, String internalMessage){
        super(internalMessage);
        this.internalMessage = internalMessage;
        this.errorCode = errorCode;
        this.system=system;
    }
    public SimulateException(ErrorCode errorCode, PaymentSystem system){
        super(errorCode.getMsg());
        this.errorCode = errorCode;
        this.system=system;
    }

    public SimulateException(ErrorCode errorCode){
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }
    public String getCode(){
        return this.errorCode.getCode();
    }

    public String getSystemId(){
        if(system == null){
            return null;
        }
        return this.system.getSystemId();
    }

    public String getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(String internalMessage) {
        this.internalMessage = internalMessage;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public PaymentError toPaymentError(String systemId){
        return new PaymentError(this.errorCode.getCode(), this.internalMessage.isEmpty() ? this.errorCode.getMsg():this.internalMessage, systemId);
    }

    public PaymentError toPaymentError(){
        return new PaymentError(this.errorCode.getCode(), this.internalMessage.isEmpty() ? this.errorCode.getMsg():this.internalMessage, this.getSystemId());
    }

    public PaymentSystem getSystem() {
        return system;
    }

    public void setSystem(PaymentSystem system) {
        this.system = system;
    }
}