public class Parent79 {
    int id;
    String name;

    public Parent79() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent79(Parent79 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent79{id=" + id + ", name='" + name + "'}";
    }
}
