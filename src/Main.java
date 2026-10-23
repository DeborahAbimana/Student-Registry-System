
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegistryManager manager = new RegistryManager();
        System.out.println("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter GPA: ");
        double gpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Major: ");
        String major = input.nextLine();
        manager.saveStudentsToFile(id, name, gpa, major);

        File file = new File("src/students.txt");
        manager.loadStudentsFromFile(file.getPath());

        manager.displayAllStudents();
        manager.groupStudentsByMajor();

        input.close();
    }
}
