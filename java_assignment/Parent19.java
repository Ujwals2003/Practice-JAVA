public class Parent19 {
    int id;
    String name;

    public Parent19(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent19(Parent19 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent19{id=" + id + ", name='" + name + "'}";
    }
}
