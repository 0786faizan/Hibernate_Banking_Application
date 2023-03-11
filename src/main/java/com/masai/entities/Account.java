package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Accno;
	private String name;
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int accno, String name, int balance) {
		super();
		Accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [Accno=" + Accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
