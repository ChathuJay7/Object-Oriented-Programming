
package package1;

public class B extends A{
    
    public static void accessNic(){
        //We can access NIC number because it's protected and it's available to child classes
        System.out.println(nic); 
    }
    
}
