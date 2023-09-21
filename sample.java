import java.util.Scanner;

public class sample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 5;
            for (int i=1; i<=n; ++i){
                System.out.println("Java is fun");
            };

        System.out.println("Question ***********         1       *********************");
        
        // 1, loop that will display a sting 99 times.   

        for(int i=0; i<100; i++){
            System.out.println("TechBridge is fun");
        }
        System.out.println("Question ***********         2       *********************");
        // 2, loop that will displayevery odd nymber from 0 - 99

        for(int i=0; i<100; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }  
        }
        System.out.println("Question ***********        3       *********************");
        // 3, loop that will display every even nymber from 0 - 99

        for(int i=0; i<100; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }  
        }
        System.out.println("Question ***********         4       *********************");
        // 4, The same loop as top, but diffrent way.
    
        int number = 0;
        
        while (number <= 99) {
            System.out.println(number);
            number += 2; // Increment by 2 to get the next even number
        }
        System.out.println("Question ***********         5       *********************");
        // 5, A loop that will sum up the odd numbers from 0 - 99

        int oddsum = 0;

        for (int number1 = 1; number1 <= 99; number1 += 2) {
            oddsum += number1;
        }
        System.out.println(" The sum of odd numbers : " + oddsum);

        System.out.println("Question ***********         6       *********************");
         // 6, A loop that will sum up the even numbers from 0 - 99

        int evensum = 0;

        for (int nums = 0; nums <= 99; nums += 2) {
            evensum += nums;
        }
        System.out.println("The sum of even numbers : " + evensum);

        System.out.println("Question ***********         7       *********************");
        // 7, A loop that finds a sum of the numbers between two numbers that are given by the user, inclusive.
        
        System.out.println("Hello please enter your first number");
        int firstnum = sc.nextInt();
        System.out.println("Please enter your second number");
        int secondnum = sc.nextInt();

        int sum = 0;

        for (int i= firstnum; i <= secondnum; i++) {
            sum += i;
        }
        System.out.println("The sum of yourinput : " + sum);

        sc.close();

    }; 
}
