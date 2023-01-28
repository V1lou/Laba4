package Class;
import Abstract.Person;
import Interface.Knew;

public class Sprouts extends Person implements Knew {
    public Sprouts(String name){setName(name);}

    public String getLetter(){
        class Read{
            private String letter;
            public Read(String letter){
                this.letter = letter;
            }
            public String readLetter(){
                return letter + " ";
        }
        }
        Read read = new Read("прочитал письмо");
        return(getName()+read.readLetter());
    }
    public String knew(){return "узнал ";}

    @Override
    public String toString(){
        return getName();
    }
}
