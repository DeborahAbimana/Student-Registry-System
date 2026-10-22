import java.io.File;

public class Main {
    public void main(String[] args){
      RegistryManager manager=new RegistryManager();
      File file=new File("src/students.txt");
      manager.loadStudentsFromFile(file.getPath());
      manager.displayAllStudents();
      manager.groupStudentsByMajor();
    }
}