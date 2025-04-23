public class Parent77 {
    int id;
    String name;

    public Parent77() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent77(Parent77 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent77{id=" + id + ", name='" + name + "'}";
    }
}
