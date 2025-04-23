public class Parent54 {
    int id;
    String name;

    public Parent54() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent54(Parent54 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent54{id=" + id + ", name='" + name + "'}";
    }
}
