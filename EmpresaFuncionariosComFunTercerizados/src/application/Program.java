package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.println(barra());

			System.out.print("Outsorce employee? [Y/N]: ");
			char op = sc.next().charAt(0);

			System.out.println();

			while (true) {

				sc.nextLine();
				if (op == 'y' || op == 'Y') {
					System.out.println("Employee N° " + i + 1);
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					int hour = sc.nextInt();
					System.out.print("Value per hours: ");
					double values = sc.nextDouble();
					System.out.print("Additional charge: ");
					double additional = sc.nextDouble();
					System.out.println();

					lista.add(new OutsourcedEmployee(name, hour, values, additional));
					break;
				}

				else if (op == 'n' || op == 'N') {
					System.out.println("Employee N° " + i + 1);
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					int hour = sc.nextInt();
					System.out.print("Value per hours: ");
					double values = sc.nextDouble();

					System.out.println();
					lista.add(new Employee(name, hour, values));
					break;
				}

				else {
					System.out.println("/n" + barra());
					System.out.println("You entered an invalid value: ");
					System.out.print("Outsorce employee? [Y/N]: ");
					op = sc.next().charAt(0);
				}
			}
		}

		System.out.println("\n" + barra());
		System.out.println("Payments: ");

		for (Employee lis : lista) {
			System.out.println(lis.toString());
		}

		sc.close();
	}

	public static String barra() {
		return "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
	}
}
