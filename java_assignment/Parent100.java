public class Parent100 {
    int id;
    String name;

    public Parent100() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent100(Parent100 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent100{id=" + id + ", name='" + name + "'}";
    }
}
