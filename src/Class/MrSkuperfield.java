package Class;
import Abstract.Person;
import Interface.*;

import java.io.FileNotFoundException;


public class MrSkuperfield extends Person implements Grew, Sad, Choosed, Knew, Muted, Turned, Talk, Eat, Moved, Happy, Escaped, Pay, Said, Fidgeted, Caress, Wanted, See, Dressed {
    public MrSkuperfield(String name){setName(name);}

    public String fidgeted(){return "заёрзал на месте от нетерпения";}
    public String caress(){return "приласкать ";}
    public String wanted(){return "хотел ";}
    public String see(){return "увидать";}
    public String dressed(){return "надел цилиндр";}
    public String said(){return "говорит";}
    public String pay(){return "не оплатил долг ";}
    public String escaped(){return "сбежал";}
    public String happy(){return "рад";}
    public String moved(){return "поехал на";}
    public String eat(){return "сможет пообедать ";}
    public String talk(){return "поговорить о дельце";}
    public String turned(){return "вертел головой";}
    public String muted(){return "молчит";}
    public String knew(){return "обнаружил ";}
    public String choosed(){return "вышел из ";}
    public String sad(){return "спотыкался";}
    public String grew(){return "восхищался";}

    public static void run() throws FileNotFoundException {}

    public static class Danger{
        public String about() { return " затеял опасную игру";}
    }

    @Override
    public String toString(){
        return getName();
    }

}
