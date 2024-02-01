package com.paymentservice.service;

import com.paymentservice.entity.Membership;

public interface MembershipService {

	void save(Membership Membership);

	Membership get(Long membershipId);

	Membership deleteById(Long membershipId);

	//void update(Membership Membership);

	

	void updateEntity(Long paymentId, String paymentMode);

}
