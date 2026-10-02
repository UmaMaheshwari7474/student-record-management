import java.util.*;
public class StudentManager{
    private ArrayList<Student> students=new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student successfully added.");
    }
    public void viewStudent(){
        if(students.isEmpty()){
            System.out.println("There is no student found.");
            return;
        }
        System.out.println("---- Student Records ----");
        for(Student student:students){
            System.out.println(student);
        }
    }
    public boolean updateStudent(int id,String name,double marks){
        for(Student student:students){
            if(student.getId()==id){
                 student.setName(name);
                 student.setMarks(marks);
                 return true;
            }
        }
        return false;
    }
    public boolean deleteStudent(int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}