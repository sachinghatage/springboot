package com.aop.dao;

import org.springframework.stereotype.Component;

import com.aop.anno.MyTx;

@Component
public class EmployeeDao {
	
	
	@MyTx
	public void saveEmployee() {
		System.out.println("save employee");
		
		//throw new RuntimeException("dummyException");
	}

}
