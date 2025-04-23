public class Parent8 {
    int id;
    String name;

    public Parent8(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent8(Parent8 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent8{id=" + id + ", name='" + name + "'}";
    }
}
