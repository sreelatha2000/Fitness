package com.paymentservice.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservice.entity.Membership;
import com.paymentservice.repository.MembershipRepository;
import com.paymentservice.service.MembershipService;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	MembershipRepository membershipRepository;

	@Override
	public void save(Membership membership) {
		membershipRepository.save(membership);

	}

	@Override
	public Membership get(Long membershipId) {
		
		return membershipRepository.findById(membershipId).orElseThrow(
				() -> new IllegalArgumentException("member not found with id-" + membershipId));
	}

	@Override
	public Membership deleteById(Long paymentId) {
		
		return null;	

}



	 
	 @Transactional
public void updateEntity(Long membershipId, String membershipType) {
	membershipRepository.findById(membershipId).orElse(null);
	
	
	
//	  if(membership!=null) 
//	  { membership.setPaymentMode(paymentMode);
//	  membershipRepository.save(membership); 
//	  }
	 
}
}
