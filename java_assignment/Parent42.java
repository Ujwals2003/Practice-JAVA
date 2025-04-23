public class Parent42 {
    int id;
    String name;

    public Parent42(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent42(Parent42 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent42{id=" + id + ", name='" + name + "'}";
    }
}
