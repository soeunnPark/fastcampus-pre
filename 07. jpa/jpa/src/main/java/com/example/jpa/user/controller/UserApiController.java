package com.example.jpa.user.controller;

import com.example.jpa.user.db.UserEntity;
import com.example.jpa.user.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserApiController {


    // 생성자로 UserRepository 주입받겠다.
    // repository를 spring으로부터 주입받을 것이다.
    private final UserRepository userRepository;

    @GetMapping("/find-all")
    public List<UserEntity> findAll() {
        // 전체를 가져오기

        // db 서버의 테이블의 내용을 가져올 때
        // jpa에서 구현해둔 JpaRepository를 상속받음으로서 쿼리를 날리지 않고 findAll을 통해 내용을 가져올 수 있다.
        return userRepository.findAll();
    }

    @GetMapping("/name")
    public void autoSave(
            @RequestParam String name
            ) {
        var user = UserEntity.builder()
                // id, age, email은 db에서 auto generate 생성
                .name(name)
                .build();
        userRepository.save(user);

    }

    // spring data JPA를 사용함으로써 sql 문을 사용하지 않는다.
    // 자동으로 query가 만들어지고 spring jpa를 통해 실행이 된다.
    // 해당 쿼리문은 JDBC를 통해 db에 질의가 된다.
    // spring에서 hibernate를 통해 코드를 감싸놨고
    // findAll 메서드를 호출하게 되면 JPA를 구현한 hibernate의 특정 코드를 실행시키고
    // JPA 인터페이스 구현된 내용을 통해 JDBC 지나 DB에 질의가 된다.
}
