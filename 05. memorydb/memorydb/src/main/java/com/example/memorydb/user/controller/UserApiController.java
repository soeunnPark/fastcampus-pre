package com.example.memorydb.user.controller;

import com.example.memorydb.user.model.UserEntity;
import com.example.memorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// HTTP request 내용을 처리하고 response를 처리하는 영역이다.
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;
    @PutMapping("")
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ) {
        return userService.save(userEntity);

    }





}
