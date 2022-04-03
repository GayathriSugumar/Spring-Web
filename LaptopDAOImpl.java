package com.xworkz.laptop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LaptopDAOImpl implements LaptopDAO{

	@Autowired
	private SessionFactory factory;
	
		public LaptopDAOImpl() {
			System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}

	@Override
	public boolean saveLaptopEntity(Object obj) {
		System.out.println("Invoked saveLaptopEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(obj);
			session.getTransaction().commit();
			System.out.println("LaptopEntity is saved");
			return true;
		} catch (Exception e) {
			System.out.println("LaptopEntity is not saved");
			session.getTransaction().rollback();
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return false;
	}
	

}
