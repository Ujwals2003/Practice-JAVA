public class Parent11 {
    int id;
    String name;

    public Parent11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent11(Parent11 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent11{id=" + id + ", name='" + name + "'}";
    }
}
