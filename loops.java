import java.util.*;

public class loops {
    public static void main(String args[]) {
         
        /*int counter = 0;
        while (counter < 100) {
            System.out.println("hello world");
            counter++;
        }
        System.out.println("printed hello 100 times");

        // print number from 1 to 100
         counter = 0;
        while (counter< 100) {
            System.out.println("I am Shrey");
            counter++;
        }
         // ✅ THIS is the missing closing part you forgot
         */

          /*int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;*/
       /* Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.println(counter+ " ");
            counter++
        }
        System.out.println();
        */
      /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum is " + sum); 
        */
        // for loop 
        /* for(intialisation ; condition; updation  ){
         // do something
        } */
      /*  for(int i = 1; i<=10; i++){
        System.out.println("hello world");
       } */
        /*
        print SQUARE PATTERN
         ****
         ****
         ****
         ****

         */
        /*for (int line= 1 ; line <=4; line++){
            System.out.println("****");
        }*/
           // PRINT REVERSE OF A NUMBER 
        /*for (int n= 10899; n>0 ; n= n/10){
            int digit = n%10;
            System.out.print(digit); */

            // REVERSE THE GIVEN NUMBER 
            /*int rev = 0;
            for (int n = 10947; n>0; n=n/10){
                int lastdigit= n%10;
                rev = (rev*10)+ lastdigit;
            

            }
        System.out.println("Reversed number is: "+ rev); 
        */


        // DO WHILE LOOP
        //int counter = 1;
        /*do {
            System.out.println("hello shrey");
            counter++;
        } while (counter <=10); */

        // BREAK STATEMENT
        /*for (int i = 1; i<= 10 ; i++){
            if(i ==5)
            break;
            System.out.println(i);
        }
        System.out.println("i am out from loop");*/

        // keeping entering nimber till user enter a multiple of 10
        /*Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n% 10 == 0){
                    break;
                }
                System.out.println(n);
            } while(true); */



            // continue statement
            /*for(int i = 1; i<=10; i++){
                if (i ==5){
                    continue; // skips the current iteration when i is 5
                }
                System.out.println(i); */
       

        /*Scanner sc = new Scanner(System.in);
    do {
        System.out.print("enter a number: " );
        int n = sc.nextInt();
        if (n % 10== 0){
            continue; // skips the rest of the loop if n is a multiple of 1

        }
        System.out.println("number was"  +n);
    } */
   //check if a number is prime or not a prime
       /*  Scanner sc = new Scanner (System.in);
        int  n = sc.nextInt();
        if(n==2){
            System.out.println("n is a prime number");
        } else{
            boolean isPrime = true;
            for (int i =2 ; i<=Math.sqrt(n) ; i++){
                if (n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.print("n is a prime number");
            }else{
                System.out.println(" n not is a prime number");

            }
            }
        }
        }
          */

            

            
            
        
        

    
         




        
 


        
    

