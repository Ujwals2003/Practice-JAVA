public class Parent58 {
    int id;
    String name;

    public Parent58() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent58(Parent58 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent58{id=" + id + ", name='" + name + "'}";
    }
}
