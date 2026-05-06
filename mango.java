import java.util.Scanner;

public class mango {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
            if(n<=c||n%c==1||n%c==0||n>c*(r-1))
                System.out.println("It is a mango tree");
            else {
                System.out.print(" Not a mango tree");
        }
    }
}
