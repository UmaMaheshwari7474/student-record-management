import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        StudentManager manager=new StudentManager();
        int choice;
        do{
            System.out.println("===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter student ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter marks: ");
                    double marks=sc.nextDouble();
                    Student student=new Student(id,name,marks);
                    manager.addStudent(student);
                    break;
                case 2:
                    manager.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter student ID to update: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter update Student name: ");
                    String newName=sc.nextLine();
                    System.out.println("Enter marks: ");
                    double updateMarks=sc.nextDouble();
                    boolean updated=manager.updateStudent(updateId, newName, updateMarks);
                    if(updated){
                        System.out.println("Student updated successfully.");
                    }
                    else{
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter student ID to delete: ");
                    int deleteId=sc.nextInt();
                    boolean deleted=manager.deleteStudent(deleteId);
                    if(deleted){
                        System.out.println("Student deleted successfully.");
                    }
                    else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Student Record Managament System...");
                    break;
                default:
                    System.out.println("Invalid choice.Please try again.");
            }
        }
        while(choice!=5);
        sc.close();
    }
}