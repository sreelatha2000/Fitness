package com.traineeservice.bean;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserBean {
	private Long userId;
	private String userName;
	private String password;
	private String dob;
	private Long age;
}
