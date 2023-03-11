package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class DepositUseCase {

	 public static void main(String[] args) {
		
		 AccountDao dao = new AccountDaoImpl();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Account number");
		 
		 int ano = sc.nextInt();
		 
	   Account acc = dao.findAccount(ano);
	   
	   if(acc == null)
		   System.out.println("Account does not exist...");
		 
	   else
		   System.out.println("Enter the amount to deposit");
	   
	   int amt = sc.nextInt();
	   acc.setBalance(acc.getBalance()+amt);
	   
	   boolean f = dao.updateAccount(acc);
	   
	   if(f)
		   System.out.println("Deposited successfully....");
	   else
		   System.out.println("Technical Error...");
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
