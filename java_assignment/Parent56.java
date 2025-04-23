public class Parent56 {
    int id;
    String name;

    public Parent56() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent56(Parent56 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent56{id=" + id + ", name='" + name + "'}";
    }
}
