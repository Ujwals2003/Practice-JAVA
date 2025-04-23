public class Parent39 {
    int id;
    String name;

    public Parent39(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent39(Parent39 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent39{id=" + id + ", name='" + name + "'}";
    }
}
