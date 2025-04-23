public class Parent40 {
    int id;
    String name;

    public Parent40(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent40(Parent40 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent40{id=" + id + ", name='" + name + "'}";
    }
}
