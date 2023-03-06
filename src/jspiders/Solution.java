package jspiders;
import java.util.Scanner;

/**
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * created Scanner class for taking input from user 
 * created BankImpl class in this class for using logic of functions
 * while loop is helps for repeated option for user untill he is close
 * using switch condition for taking choice of user
 */

public class Solution {
	public static void main(String[] args) {
		Bank bank = new BankImpl(0);
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("1.Deposit Amount\n2. Withdraw Amount\n3. Check Balance\n4. Exit");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1 : {
				System.out.println("Enter Your Amount for Depositing");
				bank.deposit(scan.nextInt());
				System.out.println("Your Available balance is " + bank.getBalance());
				break;
			} 
			case 2 : {
				System.out.println("Enter amount for withdrawal");
				bank.withdraw(scan.nextInt());
				System.out.println("Your Available balance is " + bank.getBalance());
				break;
			} 
			case 3 : {
				System.out.println("Your Available balance is " + bank.getBalance());
				break;
			} 
			case 4 : {
				System.out.println("Thank You!");
				System.exit(0);
			}
			default : {
				System.out.println(bank.displayErrorMessage());
			}
			}
			System.out.println("_____________________________________");
		}
		
	}
}
