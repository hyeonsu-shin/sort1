import java.util.Arrays;
public class ShellSort{
    public static void intervalSort(int[] arr, int begin, int end, int interval) {
        int j;
        for(int i=begin+interval;i<=end;i=i+interval) {
            int item = arr[i];
            for(j = i-interval;j>=begin && item<arr[j]; j=j-interval) {
                arr[j+interval] = arr[j];
            }
            arr[j+interval] = item;
        }
    }
    public static void shellSort(int[] arr) {
        int size = arr.length;
        int interval = size/2;
        while (interval >=1){
            for(int i=0;i<interval;i++) {
                intervalSort(arr, i, size-1, interval);
            }
            System.out.println("interval = "+interval);
            for(int t=0;t<size;t++) {
                System.out.print(arr[t]+" ");
            }
            System.out.println();
            interval = interval/2;
        }
    }

    public static void main(String[]args){
        int[] arr = new int[]{30,60,90,10,40,80,40,20,10,60,50,30,40,90,80};
        shellSort(arr);
    }
}