package staticModifierPractice;

public class Main {

    public static void main(String[] var0) {

//    Create at least 3 Student objects.
        Student student1 = new Student("Alice", 90);
        Student student2 = new Student("Bob", 85);
        Student student3 = new Student("Charlie", 92);

//    Call the static method to print the total number of students.
        Student.printTotalStudents();

//    Call the instance method for each student to display their details.
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();


//    Add a static block to set totalStudents to 0 at the very start (and print a message saying "Static block executed" when it runs).

/*    Expected Output Example
    Static block executed  // (if optional part is done)
    Total students created: 3
    Name: Alice, Grade: 90
    Name: Bob, Grade: 85
    Name: Charlie, Grade: 92

    What this task will teach:
    How to use static fields for shared data.
    How to create and use static methods.
    How instance methods can access both static and instance data.

            (Optional) How a static block runs when the class is loaded.
*/

    }
}