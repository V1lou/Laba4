package Exceptions;

public class Unchecked extends Exception{
    public Unchecked(){
        super();
    }
    public Unchecked(String string){
        super(string);
    }
    public Unchecked(String string, Throwable cause){
        super(string,cause);
    }
}
