public class Parent28 {
    int id;
    String name;

    public Parent28(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent28(Parent28 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent28{id=" + id + ", name='" + name + "'}";
    }
}
