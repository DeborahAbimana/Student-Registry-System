import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class RegistryManager {
    private List<Student> students = new ArrayList<>();

    public void loadStudentsFromFile(String fileName) {

   students.clear();
   try(
    BufferedReader reader = new BufferedReader(new FileReader(fileName)))

    {
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue;
            }
            String[] data = line.split(",");
            if (data.length != 4) {
                System.out.println("INVALID RECORD: " + line);
                continue;
            }
            int id = Integer.parseInt(data[0].trim());
            String name = data[1].trim();
            double gpa = Double.parseDouble(data[2].trim());
            String major = data[3].trim();
            Student student = new Student(id, name, gpa, major);
            students.add(student);
        }
        System.out.println("Students loaded sucessfully");
    }
   catch(
    IOException e)

    {
        System.out.println("Error reading file: " + e.getMessage());
    }
   catch(
    NumberFormatException e)

    {
        System.out.println("Invalid student gpa or ID:" + e.getMessage());
    }
}
   public void displayAllStudents(){
       System.out.println("\nALL STUDENTS");

       for (Student student : students) {
           System.out.println(student);
       }
   }
   public void groupStudentsByMajor(){
       Map<String,List<String>> groups=new LinkedHashMap<>();
   }
}
