package com.syh4834.chabak.api;

public class ResponseSignin {
    private final int status;
    private final boolean success;
    private final String message;
    private final Object data;

    public ResponseSignin(int status, boolean success, String message, Object data) {
        this.status = status;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public int getStatus() { return status; }

    public boolean getSuccess() { return success; }

    public String getMessage() { return message; }

    public Object getData() { return data; }

}
