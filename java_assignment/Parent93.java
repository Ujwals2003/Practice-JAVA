public class Parent93 {
    int id;
    String name;

    public Parent93() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent93(Parent93 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent93{id=" + id + ", name='" + name + "'}";
    }
}
