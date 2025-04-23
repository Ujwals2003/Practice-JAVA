public class Parent29 {
    int id;
    String name;

    public Parent29(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent29(Parent29 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent29{id=" + id + ", name='" + name + "'}";
    }
}
