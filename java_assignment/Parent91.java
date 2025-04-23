public class Parent91 {
    int id;
    String name;

    public Parent91() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent91(Parent91 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent91{id=" + id + ", name='" + name + "'}";
    }
}
