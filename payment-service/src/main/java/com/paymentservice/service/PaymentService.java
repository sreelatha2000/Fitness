package com.paymentservice.service;

import com.paymentservice.entity.Payment;

public interface PaymentService {

	void save(Payment payment);

	Payment get(Long paymentId) throws Exception;

	Payment deleteById(Long paymentId);

	//void update(Payments payments);

	

	void updateEntity(Long paymentId, String paymentMode);

}
