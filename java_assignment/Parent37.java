public class Parent37 {
    int id;
    String name;

    public Parent37(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent37(Parent37 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent37{id=" + id + ", name='" + name + "'}";
    }
}
