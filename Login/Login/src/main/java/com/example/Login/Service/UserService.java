package com.example.Login.Service;

import com.example.Login.Dto.LoginDTO;
import com.example.Login.Dto.UserDTO;
import com.example.Login.Response.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
}
