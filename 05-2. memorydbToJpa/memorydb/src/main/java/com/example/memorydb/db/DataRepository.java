package com.example.memorydb.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T, ID> extends Repository<T, ID> {



    // create, update
    T save(T data);

    // read

    // findByID: 데이터의 아이디를 통해서 데이터를 리턴하는 메서드
    // 데이터가 있을 수도 있고 없을 수도 있기에 Optional 사용
    // 데이터 저장소에 데이터를 저장, 찾는 데이터를 리턴해준다. 돌려줄 데이터가 없을 수도 있기에 Optional을 사용하는 것이다.
    Optional<T> findById(ID id);

    List<T> findAll();


    // update
        // 데이터가 있으면 update, 없으면 save

    // delete
    void delete(ID id);

}
