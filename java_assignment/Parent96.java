public class Parent96 {
    int id;
    String name;

    public Parent96() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent96(Parent96 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent96{id=" + id + ", name='" + name + "'}";
    }
}
