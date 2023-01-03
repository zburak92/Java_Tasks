package day25_Constructors.tasks;

import java.util.ArrayList;

public class Offers {
    String location, companyName, jobTitle;
    double salary;
    boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public Offers(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offers{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}

class myOffers{
    public static void main(String[] args) {

        Offers[] myOffers = {new Offers("Austin", "Leidos", "SDET", 900000, false, true, true, true),
                new Offers("Houston", "Deloitte", "SDET", 1100000, true, false, true, true),
                new Offers("Dallas ", "LCRA", "QA", 1200000, true, true, false, true),
                new Offers("SanA", "Google", "Auto", 1300000, true, true, true, false),
                new Offers("Detroit", "GM", "Dev", 1400000, false, true, true, true),
                new Offers("Orlando", "Duke", "Dev", 1500000, true, false, true, true),
                new Offers("Miami", "FPL", "Sure", 1600000, true, true, false, true)
        };

        ArrayList<Offers> fullTimeOffers = new ArrayList<>();

        ArrayList<Offers> localOffers = new ArrayList<>();

        ArrayList<Offers> offersWithBenefits = new ArrayList<>();

        ArrayList<Offers> devOffers = new ArrayList<>();

        ArrayList<Offers> with100k = new ArrayList<>();

        for (Offers eachOffer : myOffers) {

            if(eachOffer.isFullTime)
                fullTimeOffers.add(eachOffer);

            if(eachOffer.location.equalsIgnoreCase("Austin"))
                localOffers.add(eachOffer);

            if(eachOffer.hasBenefit)
                offersWithBenefits.add(eachOffer);

            if(eachOffer.jobTitle.equalsIgnoreCase("dev"))
                devOffers.add(eachOffer);

            if(eachOffer.salary > 100000)
                with100k.add(eachOffer);

        }

        for (Offers fullTimeOffer : fullTimeOffers) {
            System.out.println(fullTimeOffer);
        }



    }
}


/*
Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */