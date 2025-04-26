public class House {
    private String color;
    private int rooms;


    public House(String color, int rooms) {
        this.color = color;
        this.rooms = rooms;
    }


    public void displayInfo() {
        System.out.println("House color: " + color);
        System.out.println("Number of rooms: " + rooms);
    }
}
