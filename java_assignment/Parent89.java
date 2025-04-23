public class Parent89 {
    int id;
    String name;

    public Parent89() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent89(Parent89 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent89{id=" + id + ", name='" + name + "'}";
    }
}
