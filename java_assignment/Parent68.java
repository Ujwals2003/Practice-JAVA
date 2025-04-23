public class Parent68 {
    int id;
    String name;

    public Parent68() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent68(Parent68 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent68{id=" + id + ", name='" + name + "'}";
    }
}
