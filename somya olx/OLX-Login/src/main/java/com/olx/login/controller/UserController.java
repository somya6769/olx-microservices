package com.olx.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.olx.login.entity.TokenDto;
import com.olx.login.entity.UserDto;
import com.olx.login.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user/authenticate")
	TokenDto autheticateUser(@RequestBody UserDto userDto) {

		return userService.authenticateUser(userDto);

	}

	@DeleteMapping("/user/logout")
	public Boolean logOutUser(@RequestHeader("auth-token") String tokenDto) {
		return userService.logoutUser(tokenDto);
	}

	@PostMapping("/user")
	public UserDto registerUser(@RequestBody UserDto userDto) {
		return userService.registerUser(userDto);
}

@GetMapping("/user/{id}")
	public UserDto getUser(@PathVariable("id") Integer id,@RequestHeader("auth-token") String token)
	{
		return userService.getUserByid(id, token);
		
	}
}
