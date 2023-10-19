package com.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		System.out.println("nani");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		NaniDAO nanidao=context.getBean("naniDAO",NaniDAO.class);
		Nani nani=nanidao.select();
		System.out.println(nani);

	}

}
