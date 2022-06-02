package com.olx.login.service;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.login.entity.Token;
import com.olx.login.entity.TokenDto;
import com.olx.login.entity.User;
import com.olx.login.entity.UserDto;
import com.olx.login.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	Token token = new Token();
	@Autowired
	private ModelMapper modelMapper;

	public TokenDto authenticateUser(UserDto userDto) {

		if (userDto.getUserName().equalsIgnoreCase("anand") && userDto.getPassword().equalsIgnoreCase("anand123")) {
			token.setKye("auth-token");
			Random rand = new Random();
			int random = rand.nextInt(1000);
			String s = "sg6767" + random + "";

			token.setValue(s);

		}
		return modelMapper.map(token, TokenDto.class);
	}
@Override
	public Boolean logoutUser(String tokenDto) {
		if (tokenDto.equals(token.getValue())) {
			token.setKye(null);
			token.setValue(null);
			return true;
		} else {
			return false;
		}
	}
@Override
public UserDto registerUser(UserDto userDto) {
		
	User user=	userRepository.save( modelMapper.map(userDto, User.class));
		
		return modelMapper.map(user, UserDto.class);
	}
@Override
	public UserDto getUserByid(Integer id, String token2) {
		
		if (token2.equals(token.getValue())) {

		User byId = userRepository.getById(id);
		
		return modelMapper.map(byId, UserDto.class);
		
	}else
	{
		return null;
	}
	
	
	
	}

}
