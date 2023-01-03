package day26_statics.tasks.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String owner, location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        this.servers.add(server);
    }

    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
//        for (Server eachServer : servers) {
//            this.servers.add(eachServer);
//        }
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeId){
        chefs.removeIf(p -> p.employeeID == employeeId);
    }

    public void terminateServer(int employeeId){
        servers.removeIf(p-> p.employeeID == employeeId);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", " + servers.size() +
                ", " + chefs.size() +
                '}';
    }
}
