public class Parent62 {
    int id;
    String name;

    public Parent62() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent62(Parent62 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent62{id=" + id + ", name='" + name + "'}";
    }
}
