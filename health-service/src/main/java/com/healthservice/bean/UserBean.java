package com.healthservice.bean;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Getter
@Setter
public class UserBean {
	private Long userId;
	private String userName;
	private String password;
	private Date dob;
	private Integer age;
	
}
