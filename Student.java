package Module3;
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        
        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("Name must not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Create a Student object
            Student student1 = new Student(101, "Alice", 20, "Computer Science");
            student1.displayDetails();

            // Create another Student object with invalid age
            Student student2 = new Student(102, "Bob", 22, "Mathematics");

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

