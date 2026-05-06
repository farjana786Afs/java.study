import java.util.Scanner;

public class mid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=sc.nextInt();
        if(n>100||n>999){
            System.out.print("Enter a valid number");
        }
        else{
            int m=(n/10)%10;

        }
        if(mid%3==0){
            System.out.print("Your digit is divide by 3");
        }
        else{
            System.out.print("Your digit is not divided by 3");
        }
    }
}
