
// Thread safe Singleton ----------------------------------

class SingletonThreadSafe{
    private static SingletonThreadSafe instance = null;

    private  SingletonThreadSafe(){
            System.out.println("an object has been created");
        }

    public static  SingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized(SingletonThreadSafe.class) {
                if(instance == null) {
                        instance = new SingletonThreadSafe();
                }
                
            }   
            
        }
        return instance;
    }
}
//------------------------------------------------------

public class ThreadSafe implements Runnable{
    @Override
    public void run() {
         SingletonThreadSafe.getInstance();
         System.out.println("run");
        
    }

    public static void main(String[] args) {
        new Thread( new ThreadSafe()).start();
        new Thread( new ThreadSafe()).start();
        new Thread( new ThreadSafe()).start();
    }
    
}
