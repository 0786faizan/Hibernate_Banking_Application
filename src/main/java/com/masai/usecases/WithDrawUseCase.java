package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class WithDrawUseCase {

	public static void main(String[] args) {
	
		AccountDao dao = new AccountDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number");
		int ano = sc.nextInt();
		
		Account acc = dao.findAccount(ano);
		
		if(acc == null)
			System.out.println("Account does not exist..");
		else
			System.out.println("Enter the withdrawing amount....");
		int amt = sc.nextInt();
		
		if(amt <= acc.getBalance())
		{
			acc.setBalance(acc.getBalance()-amt);
			boolean f = dao.updateAccount(acc);
			
			if(f)
				System.out.println("Please collec the cash...");
			else
				System.out.println("Technical Erro....");
		}
		else {
			System.out.println("Insufficient amount in your account...");
		}

	}

}
