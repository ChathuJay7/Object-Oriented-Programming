
package encapsulation;

public class Main {
    
    public static void main(String[] args){
        
        Student student1 = new Student();
        
        student1.setName("Amal");
        student1.setAge(20);
        student1.setGender("male");
        
        System.out.println("Student 1 details");
        System.out.println("Name : " + student1.getName());
        System.out.println("Age : " + student1.getAge());
        System.out.println("Gender : " + student1.getGender());
        
        
        Student student2 = new Student();
        
        student2.setName("Kasuni");
        student2.setAge(18);
        student2.setGender("female");
        
        System.out.println("\nStudent 2 details");
        System.out.println("Name : " + student2.getName());
        System.out.println("Age : " + student2.getAge());
        System.out.println("Gender : " + student2.getGender());
    }
}
