public class Parent88 {
    int id;
    String name;

    public Parent88() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent88(Parent88 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent88{id=" + id + ", name='" + name + "'}";
    }
}
