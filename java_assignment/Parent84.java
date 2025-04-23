public class Parent84 {
    int id;
    String name;

    public Parent84() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent84(Parent84 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent84{id=" + id + ", name='" + name + "'}";
    }
}
