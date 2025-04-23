public class Parent21 {
    int id;
    String name;

    public Parent21(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent21(Parent21 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent21{id=" + id + ", name='" + name + "'}";
    }
}
