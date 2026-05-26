package com.Ganesh.Dao;

import org.springframework.stereotype.Component;

import com.Ganesh.Service.Payment;

@Component("credit")
public class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		
		
		System.out.println("Payment Processed using Credit Card Rs = "+amount);
	}

}
