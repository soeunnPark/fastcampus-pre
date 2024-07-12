package com.example.rest_api;

import com.example.rest_api.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {


	@Autowired
	private ObjectMapper objectMapper;
	@Test
	void contextLoads() throws JsonProcessingException {

		//set 메서드 제거하고 생성자에 모두 넣어보기
		var user = new UserRequest("홍길동", 10, "hong@gmail.com", true);
//		user.setUserName("홍길동");
//		user.setUserAge(10);
//		user.setEmail("hong@gmail.com");
//		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		//var dto = objectMapper.readValue(json, UserRequest.class);
		//System.out.println(dto);

	}

}
