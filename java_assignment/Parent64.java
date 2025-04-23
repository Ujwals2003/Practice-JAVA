public class Parent64 {
    int id;
    String name;

    public Parent64() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent64(Parent64 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent64{id=" + id + ", name='" + name + "'}";
    }
}
