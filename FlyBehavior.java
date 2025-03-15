// FlyBehavior.java
interface FlyBehavior {
    void fly();
}

class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck can fly.");
    }
}

class NotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}
