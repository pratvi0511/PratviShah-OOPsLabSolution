package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random r = new Random();
		char[] password = new char[8];
		for(int i=0; i<8; i++) {
			password[i] = values.charAt(r.nextInt(values.length()));
		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String generatedEmail = firstName + lastName + "@" + department + ".efg.com";
		return generatedEmail;
	}
	
	public void showCredentials(Employee e, String email, char[] generatedPassword) {
		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Your Email is ==> " + email);
		System.out.println("Your Password is ==> " + generatedPassword);
	}

}
