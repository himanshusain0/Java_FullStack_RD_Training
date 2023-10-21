package Patterns;

import java.util.Scanner;


public class Emploee {

  static void grossSalary(double basic_salary) {
    double hra = 0.30 * basic_salary;
    double da = 0.20 * basic_salary;
    int ta = 2000;

    double grossSalary = basic_salary + hra + da + ta;

    if (grossSalary <= 600000) {
      double tax = 0.05 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 600000 && grossSalary <= 900000) {
      double tax = 0.10 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 900000 && grossSalary <= 1200000) {
      double tax = 0.15 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 1200000 && grossSalary <= 1500000) {
      double tax = 0.20 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 1500000) {
      double tax = 0.30 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name ");
    String name = sc.nextLine();
    System.out.println("Enter basic salary ");
    double basic_salary = sc.nextDouble();



    System.out.println("Name of the employee : "+name );
    grossSalary(basic_salary);
    sc.close();

  }

}