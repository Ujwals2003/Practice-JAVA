public class Parent17 {
    int id;
    String name;

    public Parent17(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent17(Parent17 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent17{id=" + id + ", name='" + name + "'}";
    }
}
