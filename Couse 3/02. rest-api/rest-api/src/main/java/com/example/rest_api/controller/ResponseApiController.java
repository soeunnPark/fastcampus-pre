package com.example.rest_api.controller;

import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/api/v1
@Slf4j
@RestController // 응답값이 json으로 내려가겠다- 선언
@RequestMapping("/api/v1")
public class ResponseApiController {

    @GetMapping("")
    public ResponseEntity<UserRequest> user() {
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");

        log.info("user: {}", user); // 중괄호 부분과 user이 매칭

        var response = ResponseEntity
                .status(HttpStatus.CREATED)
                .header("x-custom", "hi")
                .body(user);
        return response;
    }

}
