public class Parent90 {
    int id;
    String name;

    public Parent90() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent90(Parent90 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent90{id=" + id + ", name='" + name + "'}";
    }
}
