public class Parent31 {
    int id;
    String name;

    public Parent31(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent31(Parent31 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent31{id=" + id + ", name='" + name + "'}";
    }
}
