package Class;
import Abstract.Person;
import Interface.*;

public class MrKrabs extends Person implements Knew, See, Fix, Open, Muted, Happy, Sad, Listen, Turned, Drived, Choosed, Speed, Ruder {

    public MrKrabs(String name){setName(name);}

    public String turned(){return "свернул с шоссе";}
    public String drived(String car){return "вывел " + car;}
    public String choosed(){return "выбрал место";}
    public String speed(){return "сбавил скорость";}
    public String ruder(){return  "повернул руль";}
    public String listen(){return  "слушал ";}
    public String sad(){return  "опечалился";}
    public String happy(){return "тихо смеялся";}
    public String muted(){return "остановил ";}
    public String open(Boolean q){return q ? "открыл " : "закрыл ";}
    public String fix(){return "чинил ";}
    public String see(){return "взял веревку в карман";}
    public String knew(){return "узнал, что лес глухой";}



    @Override
    public String toString(){
        return getName();
    }
}
