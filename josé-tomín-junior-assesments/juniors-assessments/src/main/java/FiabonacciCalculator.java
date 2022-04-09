public class FiabonacciCalculator {

    public int calculateSerie(int max) {
        int currentNumber=1;
        int previousNumber=0;
        int result=0;

        for(int i=1;i<max;i++){
            result=currentNumber+previousNumber;
            previousNumber=currentNumber;
            currentNumber=result;
        }

        return result;
    }
}
