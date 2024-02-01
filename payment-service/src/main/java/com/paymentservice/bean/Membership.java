package com.paymentservice.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Membership  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "membership_id")
	private Long membershipId;
	
	@Column(name="membership_type")
	private String membershipType;
	
	@Column(name="membership_period")
	private String membershipPeriod;
	
	@Column(name="description")
	public String description;
	
//  @OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "user_id")
	//private UserRegistration userRegistration;
	
	
	
	

}
