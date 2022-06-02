package com.olx.login.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private Integer id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String phone;

}
