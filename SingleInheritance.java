//SINGLE INHERITANCE EXAMPLE CODE
//Super class
 class Vehicle{
    Vehicle(){
        System.out.println("This a vechicle ");
    }
}
    // subclass
    class Car extends Vehicle{
        Car(){
            System.out.println("this Vehicle is car");
        }
    }

    public class SingleInheritance{
        public  static void main(String[]args){
            Car obj = new Car();
        }
    }
    
  
    

