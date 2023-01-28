package Class;

import Abstract.Animals;
import Interface.Swim;

public class WhiteBirds extends Animals implements Swim {
    public WhiteBirds(String name){setName(name);}
    public void stay() {
        System.out.println("Птицы держались на воде без труда");

    }

    @Override
    public String toString(){return getName();}

    public String swim(){return "плавали в пруду";}
}