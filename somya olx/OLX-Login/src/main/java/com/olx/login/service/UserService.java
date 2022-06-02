package com.olx.login.service;

import com.olx.login.entity.TokenDto;
import com.olx.login.entity.UserDto;

public interface UserService {


	public Boolean logoutUser(String tokenDto) ;

	public TokenDto authenticateUser(UserDto userDto);

	public UserDto getUserByid(Integer id, String token2);

	public UserDto registerUser(UserDto userDto) ;
	

}
