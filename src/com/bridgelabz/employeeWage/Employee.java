package com.bridgelabz.employeeWage;

public class Employee
{
    public static final int isPartTime = 1;
    public static final int  isFullTime = 2;
    public static final int empRatePerHours = 20;
    public static final int numOfWorkingDays = 2;
    public static final int maxHourPerMonth = 10;


    /*
    Use Case 1 Employee Present Or Absent
     */
    public void empPresentAbsent()
    {
        int isFullTime = 1;
       double empCheck = Math.floor(Math.random() * 10) % 2 ;
        if(empCheck == isFullTime )
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        System.out.println("-*-*-*-*-*- WelCome to Employee Wage Computation -*-*-*-*-*-");
          Employee employee = new Employee(); // Create Object
        // Call Methods
          employee.empPresentAbsent();





    }
}
