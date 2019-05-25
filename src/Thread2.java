public class Thread2 extends Thread {

  public void run() {
    int count = 0;
    for (int i = 0; i <=5; i++) {
      try {
        sleep(1000);
      } catch(Exception e){

      }
      count++;
      System.out.println("Timer A: "+ count);
    }


  }
}
