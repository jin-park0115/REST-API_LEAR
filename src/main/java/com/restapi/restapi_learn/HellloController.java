package com.restapi.restapi_learn;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // 이 컨트롤러 안에 있는 모든 API의 앞부분 URL을 고정
public class HellloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring";
    }
    @PostMapping("/echo") // post 전용 출입구다. post요청 + /echo경로가 오면 이 메서드를 실행한다.
    public ResponseDTO echo(@RequestBody RequestDTO request){
        return new ResponseDTO(
                request.getMessage(),
                System.currentTimeMillis()
        );
    }
}

// RestContoller -> "이 클래스는 HTTP 요청을 받아서 응답하는 애다"
// GetMapping -> "GET /hello 요청이 오면 이 메서드를 실행해라"

// RequestMapping을 하지 않으면 @GetMapping("/api/hello")
// 매번 /api를 반복해야한다.