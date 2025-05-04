public class MainRunner {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.serve();         // From parent class
        pizza.addToppings();   // From child class
    }
}
