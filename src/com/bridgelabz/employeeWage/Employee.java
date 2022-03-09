package com.bridgelabz.employeeWage;

public class Employee
{
    public static final int IS_FULL_TIME = 1;
    public void empPresentAbsent()
    {
       double empCheck = Math.floor(Math.random() * 10) % 2 ;
        if(empCheck == IS_FULL_TIME )
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("----WelCome to Employee Wage Computation----");
          Employee employee = new Employee();
          employee.empPresentAbsent();

    }
}
