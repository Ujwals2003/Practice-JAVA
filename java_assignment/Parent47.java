public class Parent47 {
    int id;
    String name;

    public Parent47(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent47(Parent47 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent47{id=" + id + ", name='" + name + "'}";
    }
}
