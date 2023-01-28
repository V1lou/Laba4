package Class;
import Abstract.Person;
import Interface.*;



public class They extends Person implements Moved, Turned{
    public They(String name){setName(name);}


    public String moved(){return "едут ";}
    public String turned(){return "пошли в лес";}

    @Override
    public String toString() {
        return getName();
    }


}
