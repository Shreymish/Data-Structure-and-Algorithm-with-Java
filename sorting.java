/*import java.util.Arrays;



public class sorting {
    public static void bubbleSort(int arr []){
        for(int turn = 0; turn<arr.length-1;turn++){
            for(int j=0; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        for( int i=0; i<arr.length-1; i++){
        int minPos=i;
        for(int j =i+1; j<arr.length-1; j++){
            if (arr[minPos]> arr[j]){
                minPos=j;
            }


    }
    int temp =arr[minPos];
    arr[minPos]= arr[i];
    arr[i]= temp;
}
    }
public static void insertionSort(int arr[]){
    for (int i = 1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]= arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
}

    public static void main(String args[]){
        Int arr[]= {4,5,67,8};
        //bubbleSort(arr);
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        printArr(arr);
    }
        
    }*/
    import java.util.Arrays;
import java.util.Collections;

public class sorting {
    // Bubble Sort for int[]
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort for int[]
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort for int[]
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Print for primitive int[]
    public static void printArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Overload printArr for Integer[]
    public static void printArr(Integer[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test data
        int[] data = {4, 5, 67, 8};

        // 1) Bubble Sort
        bubbleSort(data);
        System.out.print("Bubble Sort:    ");
        printArr(data);

        // reset data
        data = new int[]{4, 5, 67, 8};

        // 2) Selection Sort
        selectionSort(data);
        System.out.print("Selection Sort: ");
        printArr(data);

        // reset data
        data = new int[]{4, 5, 67, 8};

        // 3) Insertion Sort
        insertionSort(data);
        System.out.print("Insertion Sort: ");
        printArr(data);

        // 4) Built-in reverse order using Collections.reverseOrder()
        Integer[] wrapper = {4, 5, 67, 8};
        Arrays.sort(wrapper, Collections.reverseOrder());
        System.out.print("Built-in Reverse: ");
        printArr(wrapper);
    }
}

   

    

