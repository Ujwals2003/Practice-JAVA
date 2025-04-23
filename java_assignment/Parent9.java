public class Parent9 {
    int id;
    String name;

    public Parent9(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent9(Parent9 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent9{id=" + id + ", name='" + name + "'}";
    }
}
