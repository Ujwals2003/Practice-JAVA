public class Parent52 {
    int id;
    String name;

    public Parent52() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent52(Parent52 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent52{id=" + id + ", name='" + name + "'}";
    }
}
