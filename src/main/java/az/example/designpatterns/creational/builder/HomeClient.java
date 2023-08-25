package az.example.designpatterns.creational.builder;

public class HomeClient {

    public static void main(String[] args) {
        Home home = new Home.HomeBuilder("Baku", 4, 15000)
                .setPlace("Mardakan")
                .setYear(2015)
                .build();
    }
}
