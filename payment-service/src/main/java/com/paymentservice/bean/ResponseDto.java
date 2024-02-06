package com.paymentservice.bean;

<<<<<<< HEAD
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class ResponseDto {
	private MembershipBean membershipBean;
	private UserBean userBean;
=======

import lombok.Data;
import lombok.Getter;

import lombok.Setter;

@Setter
	@Getter
	
	@Data
	public class ResponseDto {
	    private MembershipBean membershipBean;
	    private UserBean userBean;
		public void setMembership(MembershipBean membershipBean) {
			this.membershipBean=membershipBean;
			
		}
		
		public void setUserBean(UserBean userBean) {
			this.userBean=userBean;
			
		}
>>>>>>> 9f2391649f876c92405b903df7b2be1db553f80e

	public void setMembership(MembershipBean membershipBean) {
		this.membershipBean = membershipBean;

	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;

	}

	public MembershipBean getMembershipBean() {
		return membershipBean;
	}

	public void setMembershipBean(MembershipBean membershipBean) {
		this.membershipBean = membershipBean;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public ResponseDto(MembershipBean membershipBean, UserBean userBean) {
		super();
		this.membershipBean = membershipBean;
		this.userBean = userBean;
	}

	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
