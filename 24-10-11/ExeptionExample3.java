public class ExeptionExample3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Value c is ");
        }
        catch (ArithmeticException e) {
            System.out.println("Catched out of bounds");
            System.out.println(e);
        }
        System.out.println("Program end");
    }
}