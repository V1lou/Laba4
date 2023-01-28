
package Exceptions;

public class IsNotBrokenException extends Exception{

    @Override
    public String getMessage() {
        return "Машина пока в порядке - история не закончилась!";
    }
}