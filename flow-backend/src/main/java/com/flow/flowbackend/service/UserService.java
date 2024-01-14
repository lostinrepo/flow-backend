package com.flow.flowbackend.service;

import com.flow.flowbackend.dto.UserResponse;
import com.flow.flowbackend.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<UserResponse> getAllUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("Shiva");
        user1.setEmail("Shiva@123");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("Shivanshu");
        user2.setEmail("Shiva@123");
        users.add(user2);

        return users.stream().map(this::userToUserResponse).toList();
    }

    private UserResponse userToUserResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
