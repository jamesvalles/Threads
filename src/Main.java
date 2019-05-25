public class Main {

  public static void main(String[] args) {
    Thread1 thread1 = new Thread1();
    thread1.start();

    /*
    try{
     thread1.join();
       } catch (Exception e){
        } */

    Thread2 thread2 = new Thread2();
    thread2.start();

     /*
    try{
     thread2.join();
       } catch (Exception e){
        } */

  }
}
