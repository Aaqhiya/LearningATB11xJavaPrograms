import java.util.Scanner;
public class ex10_FibonacciSeqForLoop {
    public static void main(String[] args) {
      //F(n) = F(n-1)+F(n-2)
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int userinput = input.nextInt();

        int a = 0;
        int b = 1;
        for (int i=0; i <= userinput; i++){
            int temp = a;

            System.out.println(a);

            a = b;
            b = temp + b;



        }



    }
}
