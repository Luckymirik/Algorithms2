import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] randomIntsArray1 = IntStream.generate(() -> new Random().nextInt(100)).limit(100000).toArray();
        int[] randomIntsArray2 = IntStream.generate(() -> new Random().nextInt(100)).limit(100000).toArray();
        int[] randomIntsArray3 = IntStream.generate(() -> new Random().nextInt(100)).limit(100000).toArray();
        long start = System.currentTimeMillis();
        sortBubble(randomIntsArray1);
        System.out.println(System.currentTimeMillis() - start);
        long start2 = System.currentTimeMillis();
        sortSelection(randomIntsArray2);
        System.out.println(System.currentTimeMillis() - start2);
        long start3 = System.currentTimeMillis();
        sortInsertion(randomIntsArray3);
        System.out.println(System.currentTimeMillis() - start3);



    }
    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }
    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }
    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }
    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
    }
