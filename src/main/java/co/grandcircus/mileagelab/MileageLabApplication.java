package co.grandcircus.mileagelab;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MileageLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MileageLabApplication.class, args);
	}
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine();
				System.err.println("Enter a number, in digits.");
			}
		} while (!isValid);

		double number = scnr.nextDouble();
		scnr.nextLine();
		return number;
	}
}

