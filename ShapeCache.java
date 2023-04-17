import java.util.HashMap;
import java.util.Map;

// Client class that uses the Prototype pattern
public class ShapeCache {
    private static Map<String, Cloneable> shapeCache = new HashMap<>();

    // Add prototype objects to the shape cache
    public static void loadCache() {
        Circle circle = new Circle("Red", 5);
        shapeCache.put("RedCircle", circle);

        Circle anotherCircle = new Circle("Blue", 10);
        shapeCache.put("BlueCircle", anotherCircle);

        // Add other prototype objects to the shape cache
        // ...
    }

    // Retrieve a clone of the prototype object from the shape cache
    public static Cloneable getShape(String shapeId) {
        Cloneable shape = shapeCache.get(shapeId);
        return (Cloneable) shape.clone();
    }
}
