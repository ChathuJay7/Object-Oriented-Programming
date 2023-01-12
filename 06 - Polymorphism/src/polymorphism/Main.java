
package polymorphism;

public class Main {

    public static void main(String[] args) {
        
        Bank bank = new Bank();
        bank.getName();
        bank.getInterest();
        
        System.out.println();
        
        Bank sampathBank = new Sampath();
        sampathBank.getName();
        sampathBank.getInterest();
        
        System.out.println();
        
        Bank commercialBank = new Commercial();
        commercialBank.getName();
        commercialBank.getInterest();
    }
    
}
