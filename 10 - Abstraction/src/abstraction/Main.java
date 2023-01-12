
package abstraction;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println();
        
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fill();
    }
    
}
