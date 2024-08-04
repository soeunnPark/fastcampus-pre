package com.example.memorydb.book.db.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "book") // 테이블과 연결 (JPA) 맵핑하고자 하는 테이블의 이름
public class BookEntity {

    // 해당 값이 어떻게 관리될지를 지정한다.
    // mysql db에서 auto increment로 동작하고 관리되도록 한다.
    // 코드에서 관리 x db 시스템에서 관리하도록 위임한다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private BigDecimal amount;

}
