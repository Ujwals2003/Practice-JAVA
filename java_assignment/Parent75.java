public class Parent75 {
    int id;
    String name;

    public Parent75() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent75(Parent75 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent75{id=" + id + ", name='" + name + "'}";
    }
}
