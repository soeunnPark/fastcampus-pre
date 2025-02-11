package com.example.memorydb.user.service;

import com.example.memorydb.user.db.UserRepository;
import com.example.memorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserEntity save(UserEntity user) {


        // save

        return userRepository.save(user);

    }

    @GetMapping("/all")
    public List<UserEntity> findAll() {
        // save
        return userRepository.findAll();
    }

    public void delete(UserEntity id) {
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    // 오버로딩
    // 매개변수 1개
    public List<UserEntity> filterScore(int score) {
        return userRepository.findAllByScoreGreaterThanEqual(score);
    }


    // 매개변수 2개
    public List<UserEntity> filterScore(int min, int max) {
        return userRepository.findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min, max);
    }
}

