package com.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.paymentservice.entity.Payment;

@Repository
@EnableJpaRepositories
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	//void updateById(Payments payments);

}
