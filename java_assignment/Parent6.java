public class Parent6 {
    int id;
    String name;

    public Parent6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent6(Parent6 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent6{id=" + id + ", name='" + name + "'}";
    }
}
