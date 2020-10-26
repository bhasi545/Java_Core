package com.jcg.hibernate.maven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMain {

	static User userObj;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {
		
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		
		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
	}

	public static void main(String[] args) {
		System.out.println(".......Hibernate Maven Example.......\n");
		try {
			sessionObj = buildSessionFactory().openSession();
			sessionObj.beginTransaction();

			for(int i = 101; i <= 105; i++) {
				userObj = new User();
				//userObj.setUser_id(i);
				userObj.setUser_name("Editor " + 1);
				userObj.setCreated_by("Administrator");
				userObj.setCreated_date(new Date());
				userObj.setUser_salary(50000);
				
				Address homeAddress = new Address("123 Main Street","troy","MI","48084");
				userObj.setHomeAddress(homeAddress);
				userObj.setOfficeAddress(new Address("234 Main Street","troy","MI","48084"));
				
				sessionObj.persist(userObj);
				
				
			}
			System.out.println("\n.......Records Saved Successfully To The Database.......\n");

			
			sessionObj.getTransaction().commit();
		} catch(Exception sqlException) {
			if(null != sessionObj.getTransaction()) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if(sessionObj != null) {
				sessionObj.close();
			}
		}
	}
}