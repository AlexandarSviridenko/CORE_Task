package Task19;

public class FirstThread extends Thread{
   public FirstThread(String name){
       super(name);
   }

    @Override
    public void run(){
        System.out.println(this.getName() + " started");

        System.out.println(this.getName() + " finished");
    }
}
