public class Parent20 {
    int id;
    String name;

    public Parent20(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent20(Parent20 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent20{id=" + id + ", name='" + name + "'}";
    }
}
