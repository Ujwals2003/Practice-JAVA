public class Parent38 {
    int id;
    String name;

    public Parent38(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent38(Parent38 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent38{id=" + id + ", name='" + name + "'}";
    }
}
