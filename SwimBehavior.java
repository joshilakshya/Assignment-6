// SwimBehavior.java
interface SwimBehavior {
    void swim();
}

class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck swims in water.");
    }
}

class Float implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck floats on water.");
    }
}

class Drown implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck drowns in water.");
    }
}
