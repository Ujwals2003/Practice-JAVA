public class Parent83 {
    int id;
    String name;

    public Parent83() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent83(Parent83 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent83{id=" + id + ", name='" + name + "'}";
    }
}
