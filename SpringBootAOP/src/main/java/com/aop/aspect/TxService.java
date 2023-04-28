package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
	
//	@Pointcut("execution(public void com.aop.dao.EmployeeDao.saveEmployee())")
//	public void p1() {}
//
//	
//	@Before("p1()")
//	public void beginTx() {
//		System.out.println("TX Started");
//	}
//	
//	@After("p1()")
//	public void sendReport() {
//		System.out.println("report sent");
//	}
//	
//	
//	@AfterReturning("p1()")
//	public void commitTx() {
//		System.out.println("Tx is committed");
//	}
//	
//	
//	@AfterThrowing(value="p1()",throwing="th")
//	public void rollBack(Throwable th) {
//		System.out.println("Roll Back");
//	}
//	
	
	@Pointcut("@annotation(com.aop.anno.MyTx)")
	public void p1() {}
	
	
	@Before("p1()")
	public void beginTx() {
		System.out.println("Tx Begin");
	}
	
}
