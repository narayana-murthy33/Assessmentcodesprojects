package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class NaniDAOImpl implements NaniDAO {
	@Autowired
	SessionFactory sessionFactory;
   

	public Nani select() {
		// TODO Auto-generated method stub
		
	
		Session session=sessionFactory.openSession();
		Nani nani=session.get(Nani.class, "narayanamurthy5522@gmail.com");
		
		
	
			
		
		
		return nani ;
	}
	

}
