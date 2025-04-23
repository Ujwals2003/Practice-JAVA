public class Parent27 {
    int id;
    String name;

    public Parent27(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent27(Parent27 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent27{id=" + id + ", name='" + name + "'}";
    }
}
