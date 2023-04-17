/*In this example, the Circle class implements the Cloneable interface, 
    which is the prototype interface. The Circle class serves as a 
    concrete prototype class that defines the clone method to create 
    a copy of the object. The ShapeCache class acts as a client that 
    uses the Prototype pattern to create and manage a cache of prototype 
    objects. The ShapeCache class loads prototype objects into the shape 
    cache and provides a method to retrieve a clone of the prototype 
    object from the cache. When the getShape method is called, it retrieves 
    a clone of the prototype object from the cache and returns it to the 
    client, allowing the client to create new objects based on the 
    prototype objects without directly invoking their constructors. */

// Main class
public class PrototypeExample {
    public static void main(String[] args) {
        // Load prototype objects into the shape cache
        ShapeCache.loadCache();

        // Retrieve a clone of the prototype object
        Circle clonedCircle = (Circle) ShapeCache.getShape("RedCircle");
        System.out.println("Cloned Circle Color: " + clonedCircle.getColor());
        System.out.println("Cloned Circle Radius: " + clonedCircle.getRadius());

        // Retrieve another clone of the prototype object
        Circle clonedAnotherCircle = (Circle) ShapeCache.getShape("BlueCircle");
        System.out.println("Cloned Another Circle Color: " + clonedAnotherCircle.getColor());
        System.out.println("Cloned Another Circle Radius: " + clonedAnotherCircle.getRadius());
    }
}
