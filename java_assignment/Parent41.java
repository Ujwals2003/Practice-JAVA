public class Parent41 {
    int id;
    String name;

    public Parent41(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent41(Parent41 other) {
        this.id = other.id;
        this.name = other.name;
    }

    public String toString() {
        return "Parent41{id=" + id + ", name='" + name + "'}";
    }
}
