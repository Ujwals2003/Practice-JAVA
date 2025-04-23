package mutant;

public class Owner {
    public void run() {

        Mutant mutant = new Mutant();


        mutant.setName("Wolverine");
        mutant.setPower("Healing Factor");
        mutant.setStrengthLevel(8);
        mutant.setVisible(true);
        mutant.setAge(150);


        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Strength Level: " + mutant.getStrengthLevel());
        System.out.println("Is Visible: " + mutant.isVisible());
        System.out.println("Age: " + mutant.getAge());
    }
}