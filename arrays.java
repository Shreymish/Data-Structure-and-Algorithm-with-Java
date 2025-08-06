import java.util.*;

public class arrays{

    /* Function to increment all marks by 1
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        // Declare and initialize an array
        int marks[] = {34, 56, 78, 54, 34};

        // Call update function
        update(marks);

        // Print updated array
        System.out.println("Updated marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // String array
        String names[] = {"shrey", "shreyash"};
        System.out.println("\nSecond name in the array: " + names[1]);

        // Working with percentage using a few elements
        int percentage = (marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("\nAverage (percentage) = " + percentage + "%"); 
    }
} */
/* public class arrays{
        /*public static int linearSearch(int numbers[], int key){
                for(int i = 0; i < numbers.length; i++){
                        if (numbers[i]==key){
                                return i;

                        }
                }
                return -1;
        }
        public static void main(String args[]){
                int numbers[]= {34,3,5,7,89};
                int key = 7;
                int index= linearSearch(numbers, key);
                if(index == -1){
                        System.out.println("key not found");
                } else {
                        System.out.println("key found " + index);
                } 
                } */
        /*public static int getLargest(int numbers[]){
                int largest= Integer.MIN_VALUE;
                for(int i=0; i<numbers.length; i++){
                        if (largest<numbers[i]){
                                largest= numbers[i];
                        }
                }
                return largest;
        }      
        public static void main(String args[]){
                int numbers[] = {34, 4,6,7,3,55,6};
                System.out.println("Largest number is: " + getLargest(numbers)); 
        }
        */ 
        /*public static int binarySearch(int numbers[], int key){
                int start = 0 , end = numbers.length - 1;
                while (start<=end){
                        int mid = (start + end)/2;
                        if (numbers[mid] == key){
                                return mid;
                        }
                        if (numbers[mid] < key){
                                start = mid + 1;
                        } else {
                                end = mid-1;
                        }
                        }
                        return -1;
                        }
                        public static void main(String args[]){
                           int numbers[] = {2,3,5,7,8,5};
                           int key = 5;
                           System.out.println(" key found " + binarySearch(numbers, key));

                           } */

        /*public static void reverse(int numbers[]){
                int first = 0, last = numbers.length - 1;
                while (first < last ){
                        int temp = numbers[last];
                        numbers[last]= numbers[first];
                        numbers[first] = temp;
                        first++;
                        last--;
                }
                }
                public static void main(String args[]){
                       int numbers[]= {1,2,3,4,5,6,7,8,9};
                       reverse(numbers);
                       for (int i=0; i<numbers.length; i++){
                               System.out.print(numbers[i] + " ");
                       }
                          System.out.println();


                }*/
                /*public static void printArray(int numbers[]){
                        for(int i= 0; i<numbers.length; i++){
                               // int curr = numbers[i];
                               // System.out.print(curr + " ");

                        }
                        System.out.println();
                }*/
/*public static void printSubArray(int numbers[]){
        /*for (int i = 0; i < numbers.length; i++){
                int start= i;
                
                        for(int j=start; j<numbers.length; j++){
                                int end = j;
                                for(int k=start; k<=end; k++){
                                        System.out.print(numbers[k] + " ");
                                }
                                System.out.println();
                        }
                        System.out.println();

                                }

        }
                public static void main(String args[]){
                        int numbers[]= {2,3,4,67};
                        printSubArray( numbers);

           "     } */
         /*   public static void maxSubarraySum(int numbers[]){
                int currSum = 0;
                int maxSum = Integer.MIN_VALUE;
                int prefix[]= new int [numbers.length];

                prefix[0] = numbers[0];
                for(int i = 1; i<prefix.length; i++){
                        prefix[i] = prefix[i-1] + numbers[i];

                }
                for(int i = 0; i<numbers.length; i++){
                        int start= i;
                        for(int j=i; j< numbers.length; j++){
                                int end= j;
                                currSum= start ==0 ? prefix[end ] : prefix[end]- prefix[start- 1];
                                if (maxSum< currSum){
                                        maxSum= currSum;
                                }

                        }
                }
                System.out.println("max sum= " + maxSum);



           }
           public static void main(String args[]){
                int numbers[] = {1, 2, 3,5};
                maxSubarraySum(numbers);
           } */
public static void kadanes(int[] numbers){
        int ms = Integer .MIN_VALUE;
        int cs = 0;
        for (int i = 0 ; i<numbers.length; i++){
                cs = cs+ numbers[i];
                if (cs < 0){
                        cs= 0;
                }
                ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : " +ms);

}
public static void main(String args[]){
        int numbers[] = {-2,-3,-4,-5};
        kadanes (numbers); 
}
        

       } 

                        //https://chatgpt.com/share/68937036-cd14-8006-ad48-7353c388329a

