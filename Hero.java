public class Hero {
    private MovingStrategy someStrategy;

    public void setMovingStrategy(MovingStrategy someStrategy) {
        this.someStrategy = someStrategy;
    }

    public void move() {
        if (someStrategy != null) {
            someStrategy.move();
        } else {
            System.out.println("No strategy set.");
        }
    }
}
