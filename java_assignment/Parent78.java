public class Parent78 {
    int id;
    String name;

    public Parent78() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent78(Parent78 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent78{id=" + id + ", name='" + name + "'}";
    }
}
