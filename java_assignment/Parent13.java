public class Parent13 {
    int id;
    String name;

    public Parent13(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent13(Parent13 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent13{id=" + id + ", name='" + name + "'}";
    }
}
