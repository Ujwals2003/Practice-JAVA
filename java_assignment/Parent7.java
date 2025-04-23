public class Parent7 {
    int id;
    String name;

    public Parent7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent7(Parent7 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent7{id=" + id + ", name='" + name + "'}";
    }
}
