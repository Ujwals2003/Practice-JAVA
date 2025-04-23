public class Parent97 {
    int id;
    String name;

    public Parent97() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent97(Parent97 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent97{id=" + id + ", name='" + name + "'}";
    }
}
