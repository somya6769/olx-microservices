package com.olx.login.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.olx.login.entity.User;

public class UserDetailsImpl implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String Username;
	@JsonIgnore
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public UserDetailsImpl(Integer id, String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		Username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserDetailsImpl buid(User user)
	{
		
		user.get
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
