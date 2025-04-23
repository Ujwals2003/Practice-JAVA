public class Parent71 {
    int id;
    String name;

    public Parent71() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent71(Parent71 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent71{id=" + id + ", name='" + name + "'}";
    }
}
