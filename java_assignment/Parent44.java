public class Parent44 {
    int id;
    String name;

    public Parent44(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent44(Parent44 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent44{id=" + id + ", name='" + name + "'}";
    }
}
