package com.restapi.restapi_learn;

public class RequestDTO {
    private String message; // 캡슐화, 외부에서 마음대로 바꾸지 못하게함.

    public String getMessage(){
        return message; // JSON -> Java 객체 변환 시 Spring(Jackson)이 내부적으로 getMessage()를 사용함.
    }

    public void setMessage(String message){
        this.message = message; // 요청 JSON {"message" : "안녕"} -> jackson이 request.setMessage("안녕") 으로 됨
    }
}

// 요청 바디 받을 DTO
// Java는 기본적으로 객체 필드에 접근하려면 getter/setter를 쓰는 문화가 있다고 한다.
// 나중에 Lombok으로 줄일 수도 있다.
// 다음 -> 응답 DTO를 만들자.

// 핵심 포인트 Requset DTO는 받기만 함.
