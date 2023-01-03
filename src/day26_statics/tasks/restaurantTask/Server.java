package day26_statics.tasks.restaurantTask;

import java.time.LocalDate;

public class Server {

    String name;
    int employeeID;
    double hourlyRate;
    boolean isFullTime;
    LocalDate hireDate;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime, LocalDate hireDate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hireDate = hireDate;
    }

    public void takeOrder(){
        System.out.println(name+" is taking order");
    }

    public void cleanTable(){
        System.out.println(name+" is cleaning table");
    }

    public String toString() {
        String work;
        if (isFullTime) {
            work = "Full time";
        }else
            work = "Part time";

        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime + ": " + work +
                '}';
    }


}

