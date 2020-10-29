package com.jcg.hibernate.maven;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMainOnetoOne {

	static UserVehicle userVehicle;
	static Vehicle vehicle;
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
				userVehicle = new UserVehicle();
				//userObj.setUser_id(i);
				userVehicle.setUser_name("Editor " + 1);
				userVehicle.setCreated_by("Administrator");
				userVehicle.setCreated_date(new Date());
				userVehicle.setUser_salary(50000);
				
				vehicle = new Vehicle();
				vehicle.setVehicleName("Suburu" + i);
				vehicle.setUserVehicle(userVehicle);
				
				Vehicle vehicle1 = new Vehicle();
				vehicle1.setVehicleName("SuburuMany" + i);
				vehicle1.setUserVehicle(userVehicle);

				ArrayList<Vehicle> vehiclelist = new ArrayList<Vehicle>();
				vehiclelist.add(vehicle1);vehiclelist.add(vehicle);
				userVehicle.setVehicle(vehiclelist); 
				
				
				
				sessionObj.persist(vehicle);
				sessionObj.persist(vehicle1);
				sessionObj.persist(userVehicle);
				
				
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