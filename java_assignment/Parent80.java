public class Parent80 {
    int id;
    String name;

    public Parent80() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent80(Parent80 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent80{id=" + id + ", name='" + name + "'}";
    }
}
