package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class DeleteAccount {

	public static void main(String[] args) {
		
		AccountDao dao = new AccountDaoImpl();
		
		//Account acc1 = new Account();
		
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter account number");
	  int ano = sc.nextInt();
	  
	   Account acc = dao.findAccount(ano);
		
		if(acc == null)
			System.out.println("Account does not exit");
		else
			System.out.println("Enter the acc number for delete");
		
		  int acc1 = sc.nextInt();
		  
		 boolean f = dao.deleteAccount(acc1);
		 if(f)
			 System.out.println("Account deleted");
		 else
			 System.out.println("Please Provide Correct Account Number....");
}	
}