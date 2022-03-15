package com.bridgelabz.employeeWage;

public class CalculateWageForCompanies
{
    public static final int isPartTime = 1;
    public static final int  isFullTime = 2;
    public static final int empRatePerHours = 20;
    public static final int numOfWorkingDays = 2;
    public static final int maxHourPerMonth = 10;

    public static int calEmpWageForCompany(String company, int empRatePerHours,int numOfWorkingDays,int maxHourPerMonth)
    {
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while ( totalEmpHours <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays)
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
        int totalEmpWage = totalEmpHours * empRatePerHours;
        System.out.println("Total Employee Wage for Company : " +company+ " is : ( " +totalEmpHours+ " * " +empRatePerHours+ " ) : " +totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        calEmpWageForCompany("DMart",20,2,10);
        calEmpWageForCompany("Reliance",10,4,20);

    }
}
