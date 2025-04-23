public class Parent76 {
    int id;
    String name;

    public Parent76() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent76(Parent76 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent76{id=" + id + ", name='" + name + "'}";
    }
}
