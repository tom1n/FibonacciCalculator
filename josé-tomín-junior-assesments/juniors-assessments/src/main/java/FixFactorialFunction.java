public class FixFactorialFunction {

    public int factorial(int number) {
        int r = 1;
        for (int i = 1; i <= number; i++) {
            r *= i;
            System.out.println(r);
        }

        return r;
    }


}
