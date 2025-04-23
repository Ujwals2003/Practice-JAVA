public class Parent26 {
    int id;
    String name;

    public Parent26(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent26(Parent26 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent26{id=" + id + ", name='" + name + "'}";
    }
}
