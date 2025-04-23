public class Parent69 {
    int id;
    String name;

    public Parent69() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent69(Parent69 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent69{id=" + id + ", name='" + name + "'}";
    }
}
