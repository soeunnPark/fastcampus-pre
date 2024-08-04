package com.example.memorydb.user.controller;

import com.example.memorydb.user.model.UserEntity;
import com.example.memorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
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

    @GetMapping("/all")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    // delete
    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ) {
//        userService.delete(id);

    }

    // findBy id -> path variable

    @GetMapping("/id/{id}")
    public UserEntity findOne(
            @PathVariable Long id
    ) {
        var response = userService.findById(id);
        return response.get();
    }



    @GetMapping("/min_max")
    public List<UserEntity> filterScore(
            @RequestParam int min,
            @RequestParam int max

    ) {
        return userService.filterScore(min, max);

    }

}
