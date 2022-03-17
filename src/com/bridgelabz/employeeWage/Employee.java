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


    /*
    Use Case 2 calculate daily Employee wages
     */
    public void calculateDailyEmpWage()
    {
        int isFullTime = 1;
        int empHours = 0 ;
        int empWage  = 0 ;
        int empRatePerHour = 20;

        double empCheck = Math.floor(Math.random() * 10 ) % 2 ;
        if(empCheck == isFullTime)
        {
            empHours = 8;
            System.out.println("Employee Present");
        }
        else
        {
            empHours = 0 ;
            System.out.println("Employee Absent");
        }
        empWage = empHours * empRatePerHour;
        System.out.println("Employee wage : ( " +empHours+ " * " +empRatePerHour+  " ) : "+empWage);
        System.out.println("");
    }

    /*
    Use case 3 Add part-time Employee & Wage
  */
    public void addPartTimeEmp()
    {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHour = 20;
        int empHours;
        int empWage ;
        double empCheck = Math.floor(Math.random() * 10 ) % 3;
        if(empCheck == isPartTime)
        {
            empHours = 4;
            System.out.println("Employee Working Part Time");
            empWage = empHours * empRatePerHour ;
        }
        else if(empCheck == isFullTime)
        {
            empHours = 8;
            System.out.println("Employee Working Full Time");
            empWage = empHours * empRatePerHour ;
        }
        else
        {
            empHours = 0;
            System.out.println("Employee is Absent");
            empWage = empHours * empRatePerHour ;
        }

        System.out.println("Employee Wage : ( " +empHours+ " * " +empRatePerHour+  " ) : "+empWage);
        System.out.println("");
    }


    /*
    Use Case 4 using Switch Case Statement
     */
    public void usingSwitchCase()
    {
        int empHours = 0 ;
        int empWage = 0;
        int empRatePerHour = 20;
        double empCheck =  Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck)
        {
            case 1 :
                empHours = 4;
                System.out.println("Employee Working Part Time");
                break;

            case 2 :
                empHours = 8;
                System.out.println("Employee Working Full Time");
                break;

            case 3 :
                empHours = 0;
                System.out.println("Employee is Absent");
                break;
        }

        empWage = empHours * empRatePerHour ;
        System.out.println("Employee Wage : ( " +empHours+ " * " +empRatePerHour+  " ) : "+empWage);
        System.out.println("");

    }


    public static void main(String[] args)
    {
        System.out.println("-*-*-*-*-*- WelCome to Employee Wage Computation -*-*-*-*-*-");
          Employee employee = new Employee(); // Create Object
        // Call Methods
          employee.empPresentAbsent();
          employee.calculateDailyEmpWage( );
          employee.addPartTimeEmp();
          employee.usingSwitchCase();


    }
}
