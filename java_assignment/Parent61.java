public class Parent61 {
    int id;
    String name;

    public Parent61() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent61(Parent61 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent61{id=" + id + ", name='" + name + "'}";
    }
}
