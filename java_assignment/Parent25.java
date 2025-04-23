public class Parent25 {
    int id;
    String name;

    public Parent25(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent25(Parent25 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent25{id=" + id + ", name='" + name + "'}";
    }
}
