package studentlist;

public class Main {
    
    public static void main(String[] args) {
        Student [] list = new Student[3]; //Array of Objects Declaration
        
        Student s1 = new Student();
        s1.setName("Annette");
        s1.setAge(21);
        
        Student s2 = new Student();
        s2.setName("Basanti");
        s2.setAge(16);
        
        Student s3 = new Student();
        s3.setName("Andrew");
        s3.setAge(25);
        
        list [0] = s1;
        list [1] = s2;
        list [2] = s3;
        
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
        
        
        
    }

}
