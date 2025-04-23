public class Parent22 {
    int id;
    String name;

    public Parent22(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent22(Parent22 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent22{id=" + id + ", name='" + name + "'}";
    }
}
