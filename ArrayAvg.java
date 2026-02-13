public class ArrayAvg {
    public static double calculateAverage(int[] arr, int arrSize) {
        double avg = 0;
        int sum = 0;
        for(int i = 0;i<arrSize;i++){
            sum+=arr[i];
        }
        avg = (double)sum/arrSize;
        return avg;

    }
    public static void main(String[] args){
        int arr[] = {12,13,24,56,45};
        int arrSize = arr.length;
        double res = calculateAverage(arr,arrSize);
        System.out.println(res);
    }
}