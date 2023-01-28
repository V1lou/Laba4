package Class;

import Abstract.Animals;
import Interface.Swim;

public class WhiteBirds extends Animals implements Swim {
    public WhiteBirds(String name){setName(name);}

    @Override
    public String toString(){return getName();}

    public String swim(){return "плавали в пруду";}
}
