package com.masai.usecases;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class OpenAccount {

	public static void main(String[] args) {
		
		AccountDao dao = new AccountDaoImpl();
		
		Account acc1 = new Account();
		
		acc1.setName("ramu");
        acc1.setBalance(880);
        
        boolean f = dao.createAccount(acc1);
        
        if(f)
        	System.out.println("Account created...");
        else
        	System.out.println("Account not created....");
		
	}
}
