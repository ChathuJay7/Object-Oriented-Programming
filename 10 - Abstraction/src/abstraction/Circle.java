
package abstraction;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    
    public void fill(){
        System.out.println("Fill in Blue color");
    }
    
}
