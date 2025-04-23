public class Parent63 {
    int id;
    String name;

    public Parent63() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent63(Parent63 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent63{id=" + id + ", name='" + name + "'}";
    }
}
