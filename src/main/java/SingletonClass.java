public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass(){

    }

    static SingletonClass getInstance(){

        if (singletonClass == null) {

            synchronized (SingletonClass.class){
                if(singletonClass == null){
                    System.out.println("Create instance if Singleton Class.");
                    singletonClass = new SingletonClass();
                    return singletonClass;
                }
                System.out.println("Already an Instance of SingletonClass");
            }
        }
        System.out.println("Already an Instance of SingletonClass");
        return singletonClass;
    }

}
