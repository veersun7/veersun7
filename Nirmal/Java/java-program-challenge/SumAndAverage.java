public class SumAndAverage {
    public static void main(String[] args) {
        SumAvgMethod obj = new SumAvgMethod();
        int[] numbers = {5,2,1,3,4,3,6};
        int sumAvg = obj.sumAvg(numbers);
        System.out.println("Sum of Array elements : " + sumAvg);
         int avg=sumAvg/numbers.length;
         System.out.println("Average of Array elements : " + avg);
    }
}
class SumAvgMethod {
public int sumAvg (int[] numbers) {
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum= numbers[i]+sum;
        }
        return sum;
}
}