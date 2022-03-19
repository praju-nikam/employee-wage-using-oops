package com.bridgelabz.employeeWage.empwage;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numberOfWorkingDays;
    private final int maximumHrsInMonth;
    private int totalEmpWage;
//Use Case 9
    public EmpWageBuilder(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maximumHrsInMonth = maximumHrsInMonth;
    }

    public void computeEmpWage() {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= maximumHrsInMonth && totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    public String toString() {
        return "Total Emp Wage for a company: " + company + " " + "is: " + totalEmpWage;
    }

//use Case 10

    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;

    private int numOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void  addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHrsInMonth) {
        companyEmpWageArray[numOfCompany] = new  CompanyEmpWage(company, empRatePerHour, numberOfWorkingDays, maximumHrsInMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i=0; i<numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;

        while (totalEmpHrs <= companyEmpWage.getMaximumHrsInMonth()  && totalWorkingDays < companyEmpWage.getNumberOfWorkingDays()) {
            totalWorkingDays++;
            int empCheck =(int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "Emp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
    }

    public static void main(String[] args) {
        System.out.println("welcome to employee wage programs");
        EmpWageBuilder employeeWageBuilder =new EmpWageBuilder();
        employeeWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
        employeeWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
        employeeWageBuilder.computeEmpWage();
    }




}