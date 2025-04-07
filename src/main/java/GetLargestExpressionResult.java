public class GetLargestExpressionResult {



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
        }gi
        if (biggest < mult){
            biggest = mult;
        }
        if (biggest < division) {
            biggest = division;
        }
        return biggest; // return actual result instead of 0.0
    }
}
