public class Parent81 {
    int id;
    String name;

    public Parent81() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent81(Parent81 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent81{id=" + id + ", name='" + name + "'}";
    }
}
