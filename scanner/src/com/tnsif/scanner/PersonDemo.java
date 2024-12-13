package com.tnsif.scanner;

import java.util.Scanner;


public class PersonDemo {

	public static void main(String[] args) {


		Person person1 = new Person();
		person1.setAge(21);
		person1.setName("Charan");
		person1.setGender("male");
		person1.setIncome(45500.50f);
		System.out.println(person1);


		Person person2 = new Person(22, "Harsha", 378678.34f, "male");
		System.out.println(person2);


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name = sc.next();
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		System.out.println("Enter the gender of the person");
		String gender = sc.next();
		System.out.println("Enter the salary of the person");
		float salary = sc.nextFloat();

		Person person3 = new Person(age, name, salary, gender);
		System.out.println(person3);

	}
}
