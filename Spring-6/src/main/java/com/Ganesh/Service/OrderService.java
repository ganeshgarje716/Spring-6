package com.Ganesh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Ganesh.Dao.OrderDao;

@Service
public class OrderService {
	
	
	@Autowired
	OrderDao dao;
	
//	@Autowired
//	@Qualifier("upi")
	Payment payment;
	
	
	@Autowired
	public void setPayment(@Qualifier("upi") Payment payment) {
		
		this.payment=payment;
	}
	
	
//	public OrderService(@Qualifier("credit") Payment payment) {
//		
//		this.payment=payment;
//	}
	
	
	
	public void processOrder() {
		
		dao.getOrder();
		payment.pay(2000);
		System.out.println("Order Processed...✅");
	}

}
