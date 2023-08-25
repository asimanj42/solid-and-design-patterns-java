package az.example.designpatterns.creational.builder;

public class Home {

    private String city;
    private String place;
    private int year;
    private int roomCount;
    private int price;


    public Home(HomeBuilder homeBuilder) {
        this.city = homeBuilder.city;
        this.place = homeBuilder.place;
        this.year = homeBuilder.year;
        this.roomCount = homeBuilder.roomCount;
        this.price = homeBuilder.price;
    }

    public static class HomeBuilder {
        private String city;

        private int roomCount;
        private int price;


        public HomeBuilder(String city, int roomCount, int price) {
            this.city = city;
            this.roomCount = roomCount;
            this.price = price;
        }

        private String place;
        private int year;

        public HomeBuilder setPlace(String place) {
            this.place = place;
            return this;
        }


        public HomeBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Home build(){
            return new Home(this);
        }

    }
}
