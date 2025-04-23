public class Parent70 {
    int id;
    String name;

    public Parent70() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent70(Parent70 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent70{id=" + id + ", name='" + name + "'}";
    }
}
