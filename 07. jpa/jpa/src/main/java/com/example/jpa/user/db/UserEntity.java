package com.example.jpa.user.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// orm :object를 맵핑하기 위해 Entity 어노테이션을 통해 어떤 테이블에 맵핑할 것인지 name을 지정
@Entity(name = "user")     // UserEntity라는 Object를 데이터베이스와 맵핑을 시킬 것이다.
public class UserEntity {

    // ORM에 맵핑
    @Id // primary key 지정(기본키에 해당하는 Id 방식이 어떤 식으로 생성되는지 지정)
    // mysql의 경우 GenerationType에 IDENTITY 사용. 해당 값은 mysql db에 의해 auto generate가 될 것이다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String email;







}
