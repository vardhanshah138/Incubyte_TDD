package com.example.IncuByteTDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter the numbers");

		String numbers = myObj.nextLine();  // Read user input
		System.out.println("The sum is: " + calculator.add(numbers));  // Output user input
	}

}
