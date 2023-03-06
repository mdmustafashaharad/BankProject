package jspiders;
/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * using interface functions for generating abstraction for hiding
 * implementation of logics
 * 
 * created multiple some useful abstract methods
 *
 */ 
public interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
	int getBalance();
	String displayErrorMessage();
}
// all the methods in interface are automatically public and abstract