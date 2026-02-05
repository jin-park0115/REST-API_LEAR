1. REST API를 만들고 브라우저에 띄어보자.
@RestController HTTP요청 응답 하는 코드임을 선언?
@GetMapping() GET 요청 메서드 생성
만들고 브라우저에 http://localhost:포트번호/hello 후 브라우저에 hello spring이 나오면 REST API 성공이다.

2. JSON 주고 받기(POST)
요청 DTO, 응답 DTO 만들기
여기서 DTO란?
Data Transfer Object
요청/응답 전용 택배 상자로 이해하면 편하다.
DTO 없이 하면 생기는 문제: DB Entity를 그대로 외부에 노출한다, 보안문제, 필드 하나 바꾸면 API 스펙이 같이 꺠진다.

쓰는 이유는
1) 역할로 보면 DB저장, 요청 받기, 응답 보내기
2) API 계약 보호 프론트와의 약속은 DTO 기준이다.
- 내부 로직 바뀌어도 안 깨짐
- DB구조 바뀌어도 안 깨짐
- DTO만 유지하면 프론트는 안 꺠진다.
3) 보안
- 요청에 들어오면 안되는 값 차단
- 응답에 보내면 안되는 값 차단

Request & Response 차이
생성 주체가 RequestDTO는 클라이언트, ResponseDTO는 서버
목적은 입력 = RequestDTO, 출력 = ResponseDTO