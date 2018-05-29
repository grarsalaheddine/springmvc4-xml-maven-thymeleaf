package com.eheio.hello.web;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class service {
	
	kda k =new kda();
	SessionFactory sf ;
	
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	public void saisir() {
		k.setKda(4);
		k.setKdaa(2);
		k.setRefs(3);
		Session s;
		try {
			s = sf.getCurrentSession();
		}catch(HibernateException e)
		{
			s =sf.openSession();
		}
			s.save(k);
	}

}
