public class Parent99 {
    int id;
    String name;

    public Parent99() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent99(Parent99 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent99{id=" + id + ", name='" + name + "'}";
    }
}
