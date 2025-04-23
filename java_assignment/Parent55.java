public class Parent55 {
    int id;
    String name;

    public Parent55() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent55(Parent55 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent55{id=" + id + ", name='" + name + "'}";
    }
}
