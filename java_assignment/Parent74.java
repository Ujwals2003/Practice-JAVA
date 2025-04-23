public class Parent74 {
    int id;
    String name;

    public Parent74() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent74(Parent74 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent74{id=" + id + ", name='" + name + "'}";
    }
}
