public class Parent35 {
    int id;
    String name;

    public Parent35(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent35(Parent35 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent35{id=" + id + ", name='" + name + "'}";
    }
}
