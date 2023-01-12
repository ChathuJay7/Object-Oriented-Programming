
package contructors;

public class Rectangle {
    
    int length;
    int width;
    
    Rectangle(int l, int w){
        this.length = l;
        this.width = w;
        
        System.out.println("Area of Rectangle : " + this.length*this.width);
    }
    
}
