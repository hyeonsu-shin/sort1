public class BubleSort{
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
    public static void swap(int[] array, int source, int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;

    }
    public static void printArray(int[] array) {
        for (int data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] item = new int[] { 10, 40, 50, 20, 80, 30,60,90 };
        System.out.println("정렬 전");
        printArray(item);
        bubbleSort(item);
        System.out.println("정렬 후");
        printArray(item);

    }
}