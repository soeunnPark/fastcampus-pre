package com.example.memorydb.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="user") // Jpa Entity, 테이블과 연결
// JPA가 table과 mapping되기 위해서 Entity 어노테이션을 사용
public class UserEntity {

    // Entity는 primary key를 가지고 있어야 한다. (Auto Increment)
    // 데이터베이스에 위임하겠다는 속성 지정 (IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int score;
}
