public class Parent12 {
    int id;
    String name;

    public Parent12(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent12(Parent12 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent12{id=" + id + ", name='" + name + "'}";
    }
}
