public interface MovingStrategy {
    default void move(){
        System.out.println("Some strategy...");
    }
}


