public class Parent34 {
    int id;
    String name;

    public Parent34(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent34(Parent34 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent34{id=" + id + ", name='" + name + "'}";
    }
}
