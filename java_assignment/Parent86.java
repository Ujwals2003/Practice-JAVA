public class Parent86 {
    int id;
    String name;

    public Parent86() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent86(Parent86 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent86{id=" + id + ", name='" + name + "'}";
    }
}
