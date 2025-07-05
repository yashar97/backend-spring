package com.clientes_backend.response;

public class GenericResponse <T>{

    private boolean success;
    private String message;
    private T data;

    public GenericResponse() {
    }

    public GenericResponse(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public GenericResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
