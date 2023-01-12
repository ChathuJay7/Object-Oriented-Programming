
package pkginterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nApple Phone");
        InterfacePhone applePhone = new Apple();
        applePhone.showDetails();
        
        System.out.println("\nGoogle Phone");
        InterfacePhone googlePhone = new Google();
        googlePhone.showDetails();
    }
    
}
