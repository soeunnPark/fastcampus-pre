package com.example.rest_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    // http://localhost:8080/api/echo/hello

    @GetMapping(path = "/echo/{message}")
    public String echo(
            @PathVariable(name = "message") String msg

    ){
        System.out.println("echo message : "+msg);

        // TODO 대문자로 변환해서 RETURN => toUpperCase

        // String 타입의 변수 외에 다른 타입 받아보기

        // boolean, integer

        return msg.toUpperCase();
    }

}