package com.Ganesh.Dao;

import org.springframework.stereotype.Component;

import com.Ganesh.Service.Payment;

@Component("payment")
public class UPI implements Payment{

	@Override
	public void pay(double amount) {
		
		System.out.println("Payment Processed using UPI Rs = "+amount);
	}

}
