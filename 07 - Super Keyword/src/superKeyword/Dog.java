
package superKeyword;

public class Dog extends Animal{
    String color = "black";
    
    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
