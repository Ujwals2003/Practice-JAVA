public class Parent1 {
    int id;
    String name;

    public Parent1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent1(Parent1 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent1{id=" + id + ", name='" + name + "'}";
    }
}
