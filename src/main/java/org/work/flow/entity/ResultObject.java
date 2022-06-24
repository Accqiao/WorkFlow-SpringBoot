package org.work.flow.entity;

public class ResultObject {

    private Boolean isOK;
    private String message;
    private int number;
    private Object data;
    private Object extra;
    private Object error;

    public ResultObject(){

    }
    public ResultObject(Boolean isOK){
        this.isOK = isOK;
        this.message = message;
    }
    public ResultObject(Boolean isOK, int number){
        this.isOK = isOK;
        this.number = number;
    }
    public ResultObject(Boolean isOK, Object error){
        this.isOK = isOK;
        this.error = error;
    }
    public ResultObject(Boolean isOK, String message){
        this.isOK = isOK;
        this.message = message;
    }
    public ResultObject(Boolean isOK, String message, int number){
        this.isOK = isOK;
        this.message = message;
        this.number = number;
    }
    public ResultObject(Boolean isOK, String message, int number, Object data){
        this.isOK = isOK;
        this.message = message;
        this.number = number;
        this.data = data;
    }
    public ResultObject(Boolean isOK, String message, int number, Object data, Object extra){
        this.isOK = isOK;
        this.message = message;
        this.number = number;
        this.data = data;
        this.extra = extra;
    }
    public ResultObject(Boolean isOK, String message, int number, Object data, Object extra, Object error){
        this.isOK = isOK;
        this.message = message;
        this.number = number;
        this.data = data;
        this.extra = extra;
        this.error = error;
    }


    public Boolean getIsOK() {
        return isOK;
    }

    public void setOK(Boolean isOK) {
        isOK = isOK;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }


    @Override
    public String toString() {
        return "ResultObject{" +
                "isOK=" + isOK +
                ", message='" + message + '\'' +
                ", number=" + number +
                ", data=" + data +
                ", extra=" + extra +
                ", error=" + error +
                '}';
    }
}
