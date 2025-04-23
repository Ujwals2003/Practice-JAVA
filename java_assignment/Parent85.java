public class Parent85 {
    int id;
    String name;

    public Parent85() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent85(Parent85 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent85{id=" + id + ", name='" + name + "'}";
    }
}
