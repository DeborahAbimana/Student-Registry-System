public class Student {
    private int id;
    private String name;
    private double gpa;
    private String major;
    Student(int id, String name, double gpa, String major) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.major = major;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGpa(double gpa) {
        this.gpa= gpa;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                '}';
    }
}
