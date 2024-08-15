// class MultiThreadingDemo extends Thread {
//     public void run(){
//         try{
//             System.out.println("Thread "+ Thread.currentThread().getName() + " is running.");
//         } catch (Exception e) {
//             System.out.println("Exception is caught");
//         }
//     }
// }

// public class multi {
//     public static void main(String[] args){
//         int n = 8;
//         for(int i = 0; i < n; i++){
//             MultiThreadingDemo obj = new MultiThreadingDemo();
//             obj.start();
//         }
//     }
// }

class MTD implements Runnable {
    public void run(){
        try{
            System.out.println(
                "Thread " + Thread.currentThread().getName() + " is running");
        }catch(Exception e){
            System.out.println("exception is caught");
        }
    }
}

class multi {
    public static void main(String[] args) {
        int n = 8;
        for(int i=0; i<n; i++){
            Thread obj = new Thread(new MTD());
            obj.start();
        }
    }
}