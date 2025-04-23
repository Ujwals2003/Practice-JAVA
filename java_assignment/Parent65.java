public class Parent65 {
    int id;
    String name;

    public Parent65() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent65(Parent65 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent65{id=" + id + ", name='" + name + "'}";
    }
}
