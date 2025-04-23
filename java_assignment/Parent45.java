public class Parent45 {
    int id;
    String name;

    public Parent45(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent45(Parent45 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent45{id=" + id + ", name='" + name + "'}";
    }
}
