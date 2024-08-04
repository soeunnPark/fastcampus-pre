package com.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// db를 멀티 모듈로 설정함에 따라 추가해야 할 config
@Configuration
@EntityScan(basePackages = "com.delivery.db")
@EnableJpaRepositories(basePackages = "com.delivery.db")
public class JpaConfig {

}
