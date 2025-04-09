public class GetLargestExpressionResult {
    /**
     In this practical task, you will work with the if operator.
     We have created a method called getResult().
     Your task: implement it. The method should take two numbers: a and b.

     Then, it should perform the following operations between the numbers and return the largest result as a double:
     a + b
     a - b
     a * b
     a / b

     For example, if a = 10 and b = -5, then:
     a + b = 5.0
     a - b = 15.0
     a * b = -50.0
     a / b = -2.0

     The method should return the largest result: 15.0.

     Note:
     a and b can be negative numbers.

     Hint 1:
     First, you need to create a variable of type double and assign it the result of the first operation (for example, a + b).
     You will compare the other operations with this value later.

     Hint 2:
     Reassign the value of the double variable if the next operation gives a greater result than the current value.
     */
    public static void main(String[] args) {
        System.out.println(getResult(-2, -5));
    }

    public static double getResult(double a, double b) {
        // write your code here
        double sum = a + b;
        double minus = a - b;
        double mult = a * b;
        double division = a / b;
        double biggest = 0;
        if (sum > minus){
            biggest = sum;
        } else {
            biggest = minus;
        }
        if (biggest < mult){
            biggest = mult;
        }
        if (biggest < division) {
            biggest = division;
        }
        return biggest; // return actual result instead of 0.0
    }
}
