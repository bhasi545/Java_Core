package com.jcg.hibernate.maven;

import java.util.Date;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMainListCollection {

	static UserListofAddressCollection userListofAddress;
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
				userListofAddress = new UserListofAddressCollection();
				//userObj.setUser_id(i);
				userListofAddress.setUser_name("Editor " + 1);
				userListofAddress.setCreated_by("Administrator");
				userListofAddress.setCreated_date(new Date());
				userListofAddress.setUser_salary(50000);
				
				Address homeAddress = new Address("123 Main Street","troy","MI","48084");
				Address homeAddress1 = new Address("234 Main Street","troy","MI","48084");
				HashSet<Address> setOfAddress = new HashSet<Address>();
				setOfAddress.add(homeAddress);setOfAddress.add(homeAddress1);
				
				userListofAddress.setListOfAdresses(setOfAddress);
				
				sessionObj.persist(userListofAddress);
				
				
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