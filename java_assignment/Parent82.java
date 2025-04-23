public class Parent82 {
    int id;
    String name;

    public Parent82() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent82(Parent82 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent82{id=" + id + ", name='" + name + "'}";
    }
}
