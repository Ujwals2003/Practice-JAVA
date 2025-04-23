public class Parent23 {
    int id;
    String name;

    public Parent23(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent23(Parent23 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent23{id=" + id + ", name='" + name + "'}";
    }
}
