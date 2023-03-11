package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("accountUnit");
	}
	
	public static EntityManager provideEntitManager() {
		
		 return emf.createEntityManager();
	}
}
