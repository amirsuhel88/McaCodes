//write a program to implement the concept of threading by extending thread class

class MyThread extends Thread {
    public void run() {
      // code to be executed in the new thread
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      MyThread myThread = new MyThread();
      myThread.start();
    }
  }
  
  
