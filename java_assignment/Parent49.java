public class Parent49 {
    int id;
    String name;

    public Parent49(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent49(Parent49 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent49{id=" + id + ", name='" + name + "'}";
    }
}
