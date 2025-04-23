public class Parent67 {
    int id;
    String name;

    public Parent67() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent67(Parent67 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent67{id=" + id + ", name='" + name + "'}";
    }
}
