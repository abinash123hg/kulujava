//  class InnerHelloWorld extends Thread{
//    public void run(){
//       int i = 1;
//       while (i<=50) {
//          System.out.println("i cooking!!");
//          System.out.println("i am happy for cooking");
//         i++;
//       }
//    }
//  }
//   class InnerInnerHelloWorld extends Thread {
 
//    public void run(){
//       int i = 0;
//       while (i<=10) {
//         System.out.println("i-am just come from s"); 
//         System.out.println("i am feel so good from inner");
//         i++;
//       }
//    }
//  }

//  public class InnerInnerInnerHelloWorld {
//  public static void main(String[] args) {
//    InnerHelloWorld ihw = new InnerHelloWorld();
//    InnerInnerHelloWorld iihw = new InnerInnerHelloWorld();
//   ihw.start();
//   iihw.start();
//  }
   
//  }

// impliments by runnable interface

//  class InnerInnerInnerHelloWorld implements Runnable {
// public  void run(){
//    int i = 1;
//    while (i<=20) {
//       System.out.println("i am abinash");
//       System.out.println("i am happy in my medical operation");
//       i++;
//    }
// }

// }
//  class InnerInnerInnerHelloWorld_2 implements Runnable {
// public  void run(){
//    int i = 1;
//    while (i<10) {
//       System.out.println("i am subha");
//       System.out.println("i am sad for todays condelence of my friend");
//       i++;
//    }
// }

// }

// public class InnerInnerInnerInnerHelloWorld {
// public static void main(String[] args) {
//    System.out.println("all r ok or not ");
//    InnerInnerInnerHelloWorld ihw = new InnerInnerInnerHelloWorld();
//    InnerInnerInnerHelloWorld_2 iihw = new InnerInnerInnerHelloWorld_2();
//    Thread th = new Thread(ihw);
//    Thread th2 = new Thread(iihw);
//    th.start();
//    th2.start();
// }

// }

                                       // 1.sleep()
//  class mythread extends Thread {
// public void run(){
//     int i = 1;
//     while (i<=5) {
//         System.out.println("The thread number-> " +i);
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//         i++;
//     }
// }
// }                                       
// public class Innermythread {
// public static void main(String[] args) {
//     mythread th = new mythread();
//     th.start();
// }
    
// }
                                     //2.join()
//  class mythread extends Thread {
// public void run(){
//     int i = 1;
//     while (i<=5) {
//         System.out.println("The thread number-> " +i);
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//         i++;
//     }
// }
// }                                       
// public class Innermythread {
// public static void main(String[] args) {
//     mythread th = new mythread();
//     th.start();
//     try {
//         th.join();
//     } catch (InterruptedException e) {
//         System.out.println(e);
//     }
    
// System.out.println("Now this thread will be eexecuted after the eend of first");
// }

// }
                                                 //setPriority,getPriority
//  class InnerInnermythread  extends Thread{
// public void run(){
//     System.out.println("ur thread name is:"+this.getName());
//     System.out.println("ur thread name is:"+this.getPriority());
// }
// }                                                 
// public class InnerInnerInnermythread {
//  public static void main(String[] args) {
//     InnerInnermythread iim = new InnerInnermythread();
//     InnerInnermythread iim2 = new InnerInnermythread();
//     InnerInnermythread iim3 = new InnerInnermythread();
//     iim.setName("Thread1");
//     iim2.setName("Thread2");
//     iim3.setName("Thread3");

//     iim.setPriority(1);
//     iim2.setPriority(10);
//     iim3.setPriority(5);

//     iim.start();
//     iim2.start();
//     iim3.start();

//  }
    
// }
// 

//   class Innermythread extends Thread {
//   public void run(){
//     int i = 1;
//     while (i<=5) {
//         System.out.println(Thread.currentThread().getName() + "->" +"subha");
//         Thread.yield();
//         i++;
//     }
//   }
// }
// public class InnerInnermythread {
// public static void main(String[] args) {
//   Innermythread th1 = new Innermythread();
//   Innermythread th2 = new Innermythread();

//   th1.setName("Thread->A");
//   th2.setName("Thread->B");

//   th1.start();
//   th2.start();
  
// }
    
// }
class Printer {
    // 'synchronized static' means: LOCK this method for everyone
    synchronized static void print(String name) {
        int i = 1;
        while(i <= 5) {
            System.out.println(name + " is printing... " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            i++;
        }
    }
}

class MyThread extends Thread {
    String myName;
    
    // Simple constructor to just take the name
    MyThread(String name) {
        this.myName = name;
    }

    public void run() {
        // Calling the shared Printer
        Printer.print(myName);
    }
}

public class SyncTest {
    public static void main(String[] args) {
        // Create two threads with different names
        MyThread t1 = new MyThread("Dhoni");
        MyThread t2 = new MyThread("Kohli");

        t1.start();
        t2.start();
    }
}
