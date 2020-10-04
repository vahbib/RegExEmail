package com.day9.regex.email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email");
		String email = sc.nextLine();
		// UC 1 - To begin with lets validate the mandatory part and start with abc
		boolean pat1 = Pattern.matches("^[a-zA-Z0-9]{3}$", email);
		// UC2 - Ensure @ and validate the mandatory 2nd part i.e. bridgelabz
		boolean pat2 = Pattern.matches("^[a-zA-Z0-9]+@$", email);
		// UC3 - Ensure “.” after bridgelabz and validate the mandatory 3rd part i.e. co
		boolean pat3 = Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(?:.[a-zA-Z0-9]+)$", email);
		/*
		 * UC4 - Lets handle optional part i.e. xyz in abc.xyz@bridgelabz.co.in NOTE:
		 * make sure only following are valid special characters _,+, -,. proceeding to
		 * xyz
		 */
		boolean pat4 = Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:.[a-zA-Z0-9]+)$", email);
		/*
		 * UC 5 - Finally lets close the expression with supporting optional parts.
		 * Note: Top Level Domains (TLD) in the last part is the optional country code
		 * and its 2 characters only
		 */
		boolean pat5 = Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email);
		System.out.println(pat1);
		System.out.println(pat2);
		System.out.println(pat3);
		System.out.println(pat4);
		System.out.println(pat5);

		sc.close();

	}

}
