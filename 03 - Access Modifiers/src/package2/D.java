
package package2;

import package1.A;

public class D extends A{
    public static void accessNic(){
        //We can access NIC number because it's protected and it's available to child classes
        System.out.println("Package 02 : " + nic); 
    }
}
