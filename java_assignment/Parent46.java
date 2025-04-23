public class Parent46 {
    int id;
    String name;

    public Parent46(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent46(Parent46 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent46{id=" + id + ", name='" + name + "'}";
    }
}
