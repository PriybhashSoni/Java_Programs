package Array;

public class arraySumandAverage {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum is "+sum);
        int avg=sum/arr.length;
        System.out.println("average is "+avg);
        
    }
}
