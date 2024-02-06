package com.management.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private Long userId;
	private String userName;
	private String password;
	private String dob;
	private Long age;
	
   
}
