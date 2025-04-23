public class Parent16 {
    int id;
    String name;

    public Parent16(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent16(Parent16 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent16{id=" + id + ", name='" + name + "'}";
    }
}
