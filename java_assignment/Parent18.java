public class Parent18 {
    int id;
    String name;

    public Parent18(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent18(Parent18 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent18{id=" + id + ", name='" + name + "'}";
    }
}
