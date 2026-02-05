package com.restapi.restapi_learn;

public class Response {
    private String message;
    private long timestamp;

    public Response(String message, long timestamp){
        this.message = message;
        this.timestamp = timestamp;
        // 서버 내부에서 의도적으로 만들어서 응답
        // setter 없음 -> 불변 객체 성격
        // 응답은 서버가 책임지고 만든다는 의미
    }

    public String getMessage() {
        return message;
    }
    public long getTimestamp(){
        return timestamp;
    }
}
// 응답으로 보낼 데이터만 있음
// DB와 무관

// spring이 getter들을 이용해서 JSON을 생성한다.