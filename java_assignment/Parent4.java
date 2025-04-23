public class Parent4 {
    int id;
    String name;

    public Parent4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent4(Parent4 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent4{id=" + id + ", name='" + name + "'}";
    }
}
