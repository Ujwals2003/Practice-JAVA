public class Parent92 {
    int id;
    String name;

    public Parent92() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent92(Parent92 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent92{id=" + id + ", name='" + name + "'}";
    }
}
