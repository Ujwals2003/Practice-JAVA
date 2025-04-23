public class Parent24 {
    int id;
    String name;

    public Parent24(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent24(Parent24 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent24{id=" + id + ", name='" + name + "'}";
    }
}
