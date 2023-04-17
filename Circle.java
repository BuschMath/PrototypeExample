
// Prototype interface
interface Cloneable {
    Cloneable clone();
}

// Concrete prototype class
class Circle implements Cloneable {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    // Clone method to create a copy of the Circle object
    @Override
    public Cloneable clone() {
        return new Circle(this.color, this.radius);
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    // Other methods for Circle class
    // ...
}
