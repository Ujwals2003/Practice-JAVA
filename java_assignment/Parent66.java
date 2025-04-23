public class Parent66 {
    int id;
    String name;

    public Parent66() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent66(Parent66 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent66{id=" + id + ", name='" + name + "'}";
    }
}
