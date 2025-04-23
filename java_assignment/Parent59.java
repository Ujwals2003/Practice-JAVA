public class Parent59 {
    int id;
    String name;

    public Parent59() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent59(Parent59 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent59{id=" + id + ", name='" + name + "'}";
    }
}
