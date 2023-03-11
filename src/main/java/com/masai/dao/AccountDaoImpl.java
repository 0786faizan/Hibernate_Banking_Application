package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	public boolean createAccount(Account account) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntitManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		flag = true;
		
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
	}

	public boolean deleteAccount(int accno) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntitManager();
		
		Account acc = em.find(Account.class,accno);
		if(acc != null)
		{
			em.getTransaction().begin();
			
			em.remove(acc);
			
			flag = true;
			
			em.getTransaction().commit();
		}
		return flag;
	}

	public boolean updateAccount(Account account) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntitManager();
		
		em.getTransaction().begin();
		em.merge(account);
		
		flag = true;
		
		em.getTransaction().commit();
		em.close();
		return flag;
		
	}

	public Account findAccount(int accno) {
		
//		Account account = null;
//		
//		EntityManager em = EMUtil.provideEntitManager();
//		
//		account = em.find(Account.class,accno);
//		
//		return account;
 
	return  EMUtil.provideEntitManager().find(Account.class,accno);
		
		
	}

}
