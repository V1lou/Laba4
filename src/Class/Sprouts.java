package Class;
import Abstract.Person;
import Interface.Knew;

public class Sprouts extends Person implements Knew {
    public Sprouts(String name){setName(name);}

    public String knew(){return "узнал ";}

    @Override
    public String toString(){
        return getName();
    }
}
