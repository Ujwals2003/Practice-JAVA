public class Parent3 {
    int id;
    String name;

    public Parent3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent3(Parent3 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent3{id=" + id + ", name='" + name + "'}";
    }
}
