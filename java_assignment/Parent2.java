public class Parent2 {
    int id;
    String name;

    public Parent2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent2(Parent2 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent2{id=" + id + ", name='" + name + "'}";
    }
}
