package Exceptions;

public class Unchecked extends RuntimeException{
    public Unchecked(){
        super();
    }
    public Unchecked(String string){
        super(string);
    }
    public Unchecked(String string, Throwable cause){
        super(string, cause);
    }
    public Unchecked(Throwable cause){
        super(cause);
    }
}