public class Parent50 {
    int id;
    String name;

    public Parent50(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent50(Parent50 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent50{id=" + id + ", name='" + name + "'}";
    }
}
