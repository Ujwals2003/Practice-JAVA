public class Parent30 {
    int id;
    String name;

    public Parent30(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent30(Parent30 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent30{id=" + id + ", name='" + name + "'}";
    }
}
