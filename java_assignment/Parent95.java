public class Parent95 {
    int id;
    String name;

    public Parent95() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent95(Parent95 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent95{id=" + id + ", name='" + name + "'}";
    }
}
