package com.example.memorydb.user.db;

import com.example.memorydb.db.SimpleDataRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


// 어떤 entity를 다룰 것인지 Generic으로 표시: UserEntity
// id에 대한 타입 지정: Long
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // service가 아닌 interface
    // 어노테이션 쓰지 않아도 됨
}




// db를 연결하기 위해 data source 지정. localhost 3306에 연결.
// book_store db를 사용.
// mysql driver 사용
// user이름은 root

// 데이터 소스 지정

// jpa를 쓰기 위해 사용

// ddl-auto 옵션
    // 1. validate: 서버를 띄울 때 book table이 없어서 서버를 띄우지 못했다. 내용이 맞는지 확인하는 옵션이다.
    // 2. create: table을 생성한다. create-drop의 경우 메모리 db와 동일하게 사용하게 됨.
    // 3. update는 db와 나의 entity를 비교한 후 다른 내용이 있다면 update
    // validate 옵션을 추천한다. 내가 가진 entity 옵션이 원격에 적용되지 않도록 하는 것을 추천한다.


