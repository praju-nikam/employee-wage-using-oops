package com.bridgelabz.employeeWage;

public class EmpWageForCompany
{
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    private  final String company ;
    private final int empRatePerHours;
    private final int numOfWorkingDays;
    private final int maxHourPerMonth;


    public  EmpWageForCompany(String company, int empRatePerHours,int numOfWorkingDays,int maxHourPerMonth)
    {
        this.company = company;
        this.empRatePerHours = empRatePerHours;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;


    }

    public static void main(String[] args)
    {

        EmpWageForCompany dmart = new EmpWageForCompany("Dmart",20,2,10);
       // EmpWageForCompany reliance = new EmpWageForCompany("Reliance",10,3,5);
      // variables
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while ( totalEmpHours <= dmart.maxHourPerMonth && totalWorkingDays < dmart.numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10 ) % 3);

            switch (empCheck)
            {
                case isPartTime :
                     empHours = 4;
                     break;
                case isFullTime :
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalEmpHours = totalEmpHours + empHours;
            System.out.println("Days : " +totalWorkingDays+ " emp Hours : " +empHours);

        }
         int totalEmpWage = totalEmpHours * dmart.empRatePerHours;
        System.out.println("Total Employee Wage for Company : " +dmart.company+ " is : ( " +totalEmpHours+ " * " +dmart.empRatePerHours+ " ) : " +totalEmpWage);
    }
}
