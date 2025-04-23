public class Parent33 {
    int id;
    String name;

    public Parent33(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent33(Parent33 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent33{id=" + id + ", name='" + name + "'}";
    }
}
