package com.greatlearning.service;
import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("Pratvi", "Shah");
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Technical Department");
		System.out.println("2. Admin Department");
		System.out.println("3. Human Resource Department");
		System.out.println("4. Legal Department");
		
		choice = scan.nextInt();
		if (choice == 1) {
			generatedEmail = cService.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "technical");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if (choice == 2) {
			generatedEmail = cService.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "admin");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if (choice == 3) {
			generatedEmail = cService.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "HR");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else if (choice == 4) {
			generatedEmail = cService.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "legal");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(e1, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("Invalid choice!");
		}
		
	}

}
