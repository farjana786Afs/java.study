//11/02/26-Wednesday
//task:VECHILE AND WHEELS -CYCLE
 interface vechile {
    void speed(int a);    
}
 interface wheel  {
    void number(int b);

}
 class cycle implements speed,number  {
   public void speed (int a);{
    System.out.println((100));
   }
public void number (int a);{
    System.out.println((50));
}

    
}
public class Interface_ex1 {
    public static void main(String[]args){
cycle c1=new cycle();
c1.speed(100);
c1.number(50);
    }

    
}
