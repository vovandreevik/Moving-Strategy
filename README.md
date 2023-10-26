# Moving-Strategy

## Description

This Java example demonstrates a simple implementation of the Strategy Design Pattern. 

It defines different moving strategies for a "Hero" character and allows the user to choose and apply different strategies.

## Classes and Interfaces

### MovingStrategy (Interface)

- `move()`: This interface defines a `move` method for different moving strategies.

### Walking

- `move()`: Implements the `move` method for walking.

### PlaneFlying

- `move()`: Implements the `move` method for flying in a plane.

### HorseRiding

- `move()`: Implements the `move` method for riding a horse.

### CarDriving

- `move()`: Implements the `move` method for driving a car.

### Hero

- `setMovingStrategy(MovingStrategy someStrategy)`: Sets the moving strategy for the Hero.
- `move()`: Invokes the `move` method based on the current strategy.

## Usage

To use this example, you can follow these steps:

1. Create a `Hero` instance.
2. Set the moving strategy using `setMovingStrategy(MovingStrategy someStrategy)`.
3. Invoke the `move` method on the `Hero` to perform the chosen strategy.

## Examples

Here are some example usages:

```java
Hero hero = new Hero();
hero.setMovingStrategy(new Walking());
hero.move(); // Outputs: Walking...

hero.setMovingStrategy(new CarDriving());
hero.move(); // Outputs: Driving a car...
```
You can run the provided Main class to interactively choose different strategies.
