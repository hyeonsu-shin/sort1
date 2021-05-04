public class insertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = i;
            while (key > 0 && array[key - 1] > array[key]) {
                swap(array, key - 1, key);
                key--;
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
        int[] item = new int[] { 5, 1, 3, 7, 2, 9 };
        System.out.println("삽입정렬 완료");
        insertionSort(item);
        printArray(item);

    }
}