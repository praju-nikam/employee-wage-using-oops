package com.bridgelabz.employeeWage;

public class EmpWageBuilder
{
    public static final int isParTime = 1;
    public static final int isFullTime = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numberOfWorkingDays;
    private final int maximumHrsInMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String company, int empRatePerHour, int numberOfWorkingDays,
                          int maximumHrsInMonth)
    {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maximumHrsInMonth = maximumHrsInMonth;

    }

    private void computeWage()
    {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while(totalEmpHrs <= maximumHrsInMonth && totalWorkingDays <= numberOfWorkingDays)
        {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10 % 3);
            switch ((int) empCheck)
            {
                case isParTime :
                         empHrs = 4;
                         break;
                case isFullTime:
                         empHrs = 8;
                         break;
                default:
                     empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day : " +totalWorkingDays+ " Emp Hours " +empHrs);
        }

        totalEmpWage = totalEmpHrs * empRatePerHour ;
    }

    public String toString()
    {
        return "Total Emp Wage For Company : "+company+ " " + " is : " +totalEmpWage;
    }


    public static void main(String[] args) {
        System.out.println("*-*-*-*-* Welcome To Employee Wage Program *-*-*-*-*");
         EmpWageBuilder dMart = new EmpWageBuilder("DMart",20,
                                                    2,10);
         EmpWageBuilder reliance = new EmpWageBuilder("Reliance",10,
                                                   4,20);
         dMart.computeWage();
        System.out.println(dMart);
        reliance.computeWage();
        System.out.println(reliance);




    }


}
