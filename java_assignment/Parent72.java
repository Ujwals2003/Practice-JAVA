public class Parent72 {
    int id;
    String name;

    public Parent72() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent72(Parent72 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent72{id=" + id + ", name='" + name + "'}";
    }
}
