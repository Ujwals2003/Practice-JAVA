public class Parent98 {
    int id;
    String name;

    public Parent98() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent98(Parent98 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent98{id=" + id + ", name='" + name + "'}";
    }
}
