package com.example.main.services;

import com.example.main.entities.User;

public interface UserService {
	public boolean registerUser(User user);
	public User loginUser(String email, String password);
}
