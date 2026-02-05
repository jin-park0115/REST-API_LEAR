package com.restapi.restapi_learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring";
    }
}

// RestContoller -> "이 클래스는 HTTP 요청을 받아서 응답하는 애다"
// GetMapping -> "GET /hello 요청이 오면 이 메서드를 실행해라"