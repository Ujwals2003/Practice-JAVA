public class Parent57 {
    int id;
    String name;

    public Parent57() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent57(Parent57 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent57{id=" + id + ", name='" + name + "'}";
    }
}
