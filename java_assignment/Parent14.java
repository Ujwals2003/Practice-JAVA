public class Parent14 {
    int id;
    String name;

    public Parent14(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent14(Parent14 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent14{id=" + id + ", name='" + name + "'}";
    }
}
