package Exceptions;

public class Checked extends RuntimeException{
    public Checked(){
        super();
    }
    public Checked(String string){
        super(string);
    }
    public Checked(String string, Throwable cause){
        super(string, cause);
    }
    public Checked(Throwable cause){
        super(cause);
    }
}