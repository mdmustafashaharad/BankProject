package jspiders;
/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * creating a implementation class for writing some logics in methods
 */

public class BankImpl implements Bank {
	private int balance;
	
	BankImpl(int balance) {
		this.balance = balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs. "+amount);
		balance = balance + amount;    //balance+=amount;
		System.out.println("Amount Deposited Successfully");
	}
	@Override
	public void withdraw(int amount) {
		if (amount <= balance) {
			System.out.println("Withdrawing Amount Rs. "+amount);
			balance = balance - amount; ///balance-= amount;
			System.out.println("Amount Withdrawn successfully");
		}
		else {
			// Invoke an Exception and handle it using try and catch block
			// Create class of InsufficientBalanceException
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			} catch( InsufficientBalanceException e ) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getBalance() {
		return this.balance = balance;
	}
	@Override
	public String displayErrorMessage() {
		return "invalid choice , Kindly Enter valid choice!";
	}
}
