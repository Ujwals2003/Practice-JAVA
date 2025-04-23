public class Parent51 {
    int id;
    String name;

    public Parent51() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent51(Parent51 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent51{id=" + id + ", name='" + name + "'}";
    }
}
