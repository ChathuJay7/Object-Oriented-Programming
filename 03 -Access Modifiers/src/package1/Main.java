
package package1;

import package2.C;
import package2.D;

public class Main {
    
    public static void main(String[] args){
        
        // Package 1 Items
        System.out.println("Package 1");
        
        //System.out.println(A.password); password field is private so we cannot acces it from another class
        System.out.println(A.age);
        System.out.println(A.nic);
        System.out.println(A.name);
        B.accessNic();
 
        
        //Package 02 items
        System.out.println("\nPackage 2");
        //System.out.println(C.age); age field is default so we cannot acces it out side of own package
        //System.out.println(C.nic); nic field is protected so we cannot acces it from another class(not inherited class from)
        System.out.println(C.name); // we can access the name becacsue of it's a public field
        D.accessNic(); // we can access the name outside of the package because it's inherited
        
    } 
}
