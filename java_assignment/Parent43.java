public class Parent43 {
    int id;
    String name;

    public Parent43(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent43(Parent43 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent43{id=" + id + ", name='" + name + "'}";
    }
}
