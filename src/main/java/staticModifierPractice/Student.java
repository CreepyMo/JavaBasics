package staticModifierPractice;

public class Student {


//    A static field totalStudents to track how many students exist.
    public static int totalStudents;

//  Instance fields: name (String) and grade (int).
    String name;
    int grade;

//    Static Block (optional):
    static {
        totalStudents = 0;
        System.out.println("Static block executed");
}
//  A constructor that:
//    Sets the name and grade.
//    Increments the totalStudents counter.
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

//  A static method printTotalStudents() that prints the number of students.
     static void printTotalStudents(){
         System.out.println("Total students created: " + totalStudents);
    }


//  An instance method printStudentInfo() that prints "Name: ..., Grade: ...".
    public void printStudentInfo(){
        System.out.println("Name: " + this.name + ", Grade: " + this.grade);
    }


/*    Inside the main() method:

    Create at least 3 Student objects.

    Call the static method to print the total number of students.

    Call the instance method for each student to display their details.

    Static Block (optional):

    Add a static block to set totalStudents to 0 at the very start (and print a message saying "Static block executed" when it runs).

    Expected Output Example
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
