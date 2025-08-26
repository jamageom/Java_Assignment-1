import java.util.Scanner;
public class LoopTask{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for table: ");
        int tableNum=sc.nextInt();

        for(int i=1 ; i<=10; i++){
            System.out.println(tableNum +"x"+ i + "="+ (tableNum*i));
        }
        
        System.out.print("Enter how many terms you want: ");
        int n=sc.nextInt();

        int a=0, b=1;
        System.out.println("Fibonacci series: ");
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            int c= a+b;
            a=b;
            b=c;
        }
         System.out.print("\n\nEnter a number to check for Armstrong: ");
        int num = sc.nextInt();

        int original = num, result = 0;

        for (; original != 0;) {
            int digit = original % 10;
            result += Math.pow(digit, 3);
            original /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
    }
}