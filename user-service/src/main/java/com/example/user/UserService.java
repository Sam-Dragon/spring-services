package com.example.user;

import com.example.dto.UserDepartment;
import com.example.entity.User;

public interface UserService {

	User saveUser(User user);

	UserDepartment getUserById(Long id);
}
