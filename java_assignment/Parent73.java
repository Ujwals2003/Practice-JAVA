public class Parent73 {
    int id;
    String name;

    public Parent73() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent73(Parent73 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent73{id=" + id + ", name='" + name + "'}";
    }
}
