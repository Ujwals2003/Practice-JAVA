public class Parent60 {
    int id;
    String name;

    public Parent60() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent60(Parent60 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent60{id=" + id + ", name='" + name + "'}";
    }
}
