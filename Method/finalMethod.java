class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class tvs extends Bike{  
   void run(){System.out.println("running safely with 90kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new tvs();  
   honda.run();  
   }  
}  
