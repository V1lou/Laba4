package Class;

import Abstract.Animals;

public class Herd extends Animals {
    public Herd(String name){setName(name);}

    @Override
    public String toString(){
        return getName();
    }

}
