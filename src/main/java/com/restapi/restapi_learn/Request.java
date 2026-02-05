package com.restapi.restapi_learn;

public class Request {
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}

// 요청 바디 받을 DTO
// Java는 기본적으로 객체 필드에 접근하려면 getter/setter를 쓰는 문화가 있다고 한다.
// 나중에 Lombok으로 줄일 수도 있다.
// 다음 -> 응답 DTO를 만들자.
