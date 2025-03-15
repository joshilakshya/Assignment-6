// Main.java
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("\nMallard Duck Behavior:");
        mallard.display();
        mallard.performFly();
        mallard.performSwim();

        System.out.println("\nRubber Duck Behavior:");
        rubber.display();
        rubber.performFly();
        rubber.performSwim();

        System.out.println("\nDecoy Duck Behavior:");
        decoy.display();
        decoy.performFly();
        decoy.performSwim();
    }
}
