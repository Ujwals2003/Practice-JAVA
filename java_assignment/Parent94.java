public class Parent94 {
    int id;
    String name;

    public Parent94() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent94(Parent94 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent94{id=" + id + ", name='" + name + "'}";
    }
}
