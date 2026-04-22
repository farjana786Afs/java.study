public class solution {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<n;i++){
            for (int j=1;j<=n;j++)
                if(i%2!=0){
                    if(j!=n){
                        System.out.print(i+"");
                    }
                    else{
                        System.out.print((i+1)+" ");
                    }
        }
                 else{
                    if(j!=1){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(i+1);
                    }
                 }
            System.out.println();
    }
    
}
}
