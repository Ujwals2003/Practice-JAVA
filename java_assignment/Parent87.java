public class Parent87 {
    int id;
    String name;

    public Parent87() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent87(Parent87 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent87{id=" + id + ", name='" + name + "'}";
    }
}
