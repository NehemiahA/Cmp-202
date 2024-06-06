public interface Electronic{
    boolean onOrOff = false;
    boolean on();
    boolean off ();


    default void electronics(){
        if (onOrOff){
            System.out.println("Default ");
        }
    }
}
