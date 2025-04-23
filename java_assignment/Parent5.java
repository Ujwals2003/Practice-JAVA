public class Parent5 {
    int id;
    String name;

    public Parent5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent5(Parent5 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent5{id=" + id + ", name='" + name + "'}";
    }
}
