package day26_statics.tasks.restaurantTask;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {
        Server[] servers = { new Server("Burak", 29, 15.0, false, LocalDate.of(1992, 5, 4)),
                new Server("Hulya", 28, 10.0, false, LocalDate.of(1999, 7, 2)),
                new Server("Asiye", 27, 12.0, false, LocalDate.of(2002, 1, 8)),
                new Server("Nuri", 26, 20.0, true, LocalDate.of(2004, 3, 5)),
                new Server("Tugba", 25, 23.0, true, LocalDate.of(2014, 2, 6))};

        Chef[] chefs = {
                new Chef("Fehim", 23, 35, true),
                new Chef("Luis", 22, 26, false),
                new Chef("Merve", 21, 27, true)};


        Restaurant restaurant = new Restaurant("Chris", "Austin", 4);

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        for (Server server : restaurant.servers) {
            System.out.println(server);
        }

        for (Chef chef : restaurant.chefs) {
            System.out.println(chef);
        }

        System.out.println(restaurant);
    }
}
