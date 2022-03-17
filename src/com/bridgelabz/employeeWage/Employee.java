package com.bridgelabz.employeeWage;

public class Employee {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    public static final int numOfWorkingDays = 2;
    static int totalEmpWage;

    /*
        Use Case 1 Employee Present Or Absent
     */
    public void empPresentAbsent() {
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println();
    }

    /*
    Use Case 2 calculate daily Employee wages
     */
    public void calculateDailyEmpWage() {
        int isFullTime = 1;
        int empHours = 0;
        int empWage = 0;
        int empRatePerHour = 20;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime) {
            empHours = 8;
            System.out.println("Employee Present");
        } else {
            empHours = 0;
            System.out.println("Employee Absent");
        }
        empWage = empHours * empRatePerHour;
        System.out.println("Employee wage : ( " + empHours + " * " + empRatePerHour + " ) : " + empWage);
        System.out.println();
    }

    /*
    Use case 3 Add part-time Employee & Wage
  */
    public void addPartTimeEmp() {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHour = 20;
        int empHours;
        int empWage;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isPartTime) {
            empHours = 4;
            System.out.println("Employee Working Part Time");
            empWage = empHours * empRatePerHour;
        } else if (empCheck == isFullTime) {
            empHours = 8;
            System.out.println("Employee Working Full Time");
            empWage = empHours * empRatePerHour;
        } else {
            empHours = 0;
            System.out.println("Employee is Absent");
            empWage = empHours * empRatePerHour;
        }

        System.out.println("Employee Wage : ( " + empHours + " * " + empRatePerHour + " ) : " + empWage);
        System.out.println();
    }

    /*
    Use Case 4 using Switch Case Statement
     */
    public void usingSwitchCase() {
        int empHours = 0;
        int empWage = 0;
        int empRatePerHour = 20;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck) {
            case 1:
                empHours = 4;
                System.out.println("Employee Working Part Time");
                break;

            case 2:
                empHours = 8;
                System.out.println("Employee Working Full Time");
                break;

            case 3:
                empHours = 0;
                System.out.println("Employee is Absent");
                break;
        }

        empWage = empHours * empRatePerHour;
        System.out.println("Employee Wage : ( " + empHours + " * " + empRatePerHour + " ) : " + empWage);
        System.out.println();

    }

    /*
        Use Case 5 Calculating Wages for month
   */
    public void calculatingWagesForMonth() {
        int empHours = 0;
        int empWage = 0;
        int empRatePerHour = 20;
        int workingDays = 20;
        int totalEmpWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        for (int day = 0; day < workingDays; day++) {

            switch ((int) empCheck) {
                case 1:
                    empHours = 4;
                    System.out.println("Employee Working Part Time");
                    break;

                case 2:
                    empHours = 8;
                    System.out.println("Employee Working Full Time");
                    break;

                case 3:
                    empHours = 0;
                    System.out.println("Employee is Absent");
                    break;
            }
            empWage = empHours * empRatePerHour;
            System.out.println("One Day Employee Wage : " + empWage);
            System.out.println();
            totalEmpWage = empWage * empRatePerHour;

        }

        System.out.println("Total Monthly Employee Wages : ( " + empWage + " * " + empRatePerHour + ") : " + totalEmpWage);
        System.out.println();
    }

    /*
        Use Case 6 Calculate Wages till a condition of total
         working hours or days is reached for a month
    */
    public void totalWageForWorkingHoursOrDays() {
        int empHours = 0;
        int totalEmpHours = 0;
        int workingHours = 0;
        int empWage = 0;
        int empRatePerHour = 20;
        int totalEmpWage;
        int day = 1;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        while (day < 20 && totalEmpHours < 100) {
            switch ((int) empCheck) {
                case 1:
                    empHours = 4;
                    System.out.println("Employee Working Part Time");
                    break;

                case 2:
                    empHours = 8;
                    System.out.println("Employee Working Full Time");
                    break;

                case 3:
                    empHours = 0;
                    System.out.println("Employee is Absent");
                    break;
            }

            totalEmpHours = totalEmpHours + empHours;
            day++;
        }
        System.out.println();
        System.out.println("Total Employee Hours : " + totalEmpHours);
        totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Total Employee Wage  : ( " + totalEmpHours + " * " + empRatePerHour + " ) : " + totalEmpWage);
    }


    /*
       use case 8  Compute Employee Wages for Multiple Companies
  */

    public static int calEmpWageForCompanies(String company, int empRatePerHours, int numOfWorkingDays, int maxHourPerMonth) {
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck) {
                case isPartTime:
                    empHours = 4;
                    break;
                case isFullTime:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalEmpHours = totalEmpHours + empHours;
            System.out.println("Days : " + totalWorkingDays + " emp Hours : " + empHours);

        }
        int totalEmpWage = totalEmpHours * empRatePerHours;
        System.out.println("Total Employee Wage for Company : " + company + " is : " +
                "( " + totalEmpHours + " * " + empRatePerHours + " ) : " + totalEmpWage);
        return totalEmpWage;
    }

    /*
     Use  case 9  Employee Wage of each Company
  */
    private static String company = null;
    private static int empRatePerHour = 0;
    private static int numberOfWorkingDays = 0;
    private static int maximumHrsInMonth = 0;


    public Employee(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
        Employee.company = company;
        Employee.empRatePerHour = empRatePerHour;
        Employee.numberOfWorkingDays = numberOfWorkingDays;
        Employee.maximumHrsInMonth = maximumHrsInMonth;
        totalEmpWage = totalEmpWage;
    }

    public void computeWage() {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= maximumHrsInMonth && totalWorkingDays <= numOfWorkingDays) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day : " + totalWorkingDays + " Emp Hours : " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Wage For Company " + company + " is : " + totalEmpWage);
    }

 /*
  Use case 10
  */
    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*- WelCome to Employee Wage Computation -*-*-*-*-*-");
        Employee employee = new Employee(company, empRatePerHour, numberOfWorkingDays, maximumHrsInMonth); // Create Object
        // Call Methods
//          employee.empPresentAbsent();
//          employee.calculateDailyEmpWage( );
//          employee.addPartTimeEmp();
//          employee.usingSwitchCase();
//          employee.calculatingWagesForMonth();
//          employee.totalWageForWorkingHoursOrDays();
//         employee.calEmpWageForCompanies("DMart", 20,2,10);
//         employee.calEmpWageForCompanies("Reliance",10,4,20);
        Employee dMart = new Employee("DMart", 20, 2, 10);
        dMart.computeWage();
        System.out.println(dMart);
        Employee reliance = new Employee("Reliance", 10, 4, 20);
        reliance.computeWage();
        System.out.println(reliance);

    }
}