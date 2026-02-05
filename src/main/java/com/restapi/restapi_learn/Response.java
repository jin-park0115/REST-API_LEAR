package com.restapi.restapi_learn;

public class Response {
    private String message;
    private long timestamp;

    public Response(String message, long timestamp){
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }
    public long getTimestamp(){
        return timestamp;
    }
}
