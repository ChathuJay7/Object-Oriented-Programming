
package abstraction;

public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    
    public void fill(){
        System.out.println("Fill in Green color");
    }
    
}
