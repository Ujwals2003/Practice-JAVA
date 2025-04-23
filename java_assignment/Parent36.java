public class Parent36 {
    int id;
    String name;

    public Parent36(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent36(Parent36 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent36{id=" + id + ", name='" + name + "'}";
    }
}
