class Singleton{
    private static Singleton instance = null;
      private  Singleton(){
            System.out.println("an object has been created");
        }

    public static  Singleton getInstance(){
        if(instance == null)  instance = new Singleton();
        return instance;
    }
}

public class Main  { 
 
    public static void main(String[] args) {

        for(int i =0; i < 10; i++){
           Singleton.getInstance();
        }
    }
}