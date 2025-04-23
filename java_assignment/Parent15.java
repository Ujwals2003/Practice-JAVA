public class Parent15 {
    int id;
    String name;

    public Parent15(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent15(Parent15 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent15{id=" + id + ", name='" + name + "'}";
    }
}
