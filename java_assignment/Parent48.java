public class Parent48 {
    int id;
    String name;

    public Parent48(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent48(Parent48 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent48{id=" + id + ", name='" + name + "'}";
    }
}
