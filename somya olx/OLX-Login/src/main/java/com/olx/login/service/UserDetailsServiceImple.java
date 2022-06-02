package com.olx.login.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.olx.login.repository.UserRepository;

public class UserDetailsServiceImple  implements UserDetailsService {
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	userRepository.find
		return null;
	}

}
