public class Parent10 {
    int id;
    String name;

    public Parent10(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent10(Parent10 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent10{id=" + id + ", name='" + name + "'}";
    }
}
