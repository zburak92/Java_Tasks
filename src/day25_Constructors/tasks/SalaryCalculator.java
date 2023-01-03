package day25_Constructors.tasks;

import java.text.DecimalFormat;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return Double.parseDouble(decfor.format(salary() * (stateTaxRate / 100)));
    }

    public double federalTax(){
        return salary() * (federalTaxRate / 100);
    }
    
    public double salaryAfterTax(){
        return Double.parseDouble(decfor.format(salary() - federalTax() - stateTax()));
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax()+
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}


class TestSalaryCalculator{
    public static void main(String[] args) {
        System.out.println(new SalaryCalculator(15.2, 40, 1.25, 22));
    }
}

/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
