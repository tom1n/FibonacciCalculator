public class FindMaxNumber {
    public int getMax(int[] values){

        int maxNumber = 0;
        for (int number:values){
            if(number>maxNumber){
                maxNumber=number;
            }
        }
        return maxNumber;
    }
}
