class Cycle{
   private int numberOfWheels;
   private int weight;
   Cycle(int numberOfWheels,int weight){
       this.numberOfWheels=numberOfWheels;
       this.weight=weight;
   }
   public void print(){
       System.out.println("Number Of wheels :"+numberOfWheels);
       System.out.println("Weight "+weight);
   }
}
public class CycleDriver{
   public static void main(String args[]){
       Cycle C1=new Cycle(4,10);
       C1.print();
   }
}