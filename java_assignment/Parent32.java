public class Parent32 {
    int id;
    String name;

    public Parent32(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent32(Parent32 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent32{id=" + id + ", name='" + name + "'}";
    }
}
