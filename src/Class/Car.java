package Class;
import Abstract.Person;
import Interface.*;

public class Car extends Person implements Speed, Moved, Turned{

        private boolean isBroken;

        public Car(String name) {
                setName(name);
                isBroken = false;
        }

        public String moved(){return getName() + " поехала по лесу";}
        public String movedU(){return getName().substring(0,5) + "у";}
        public String movedI(){return getName().substring(0,5) + "ы";}
        public String movedE(){return getName().substring(0,5) + "е";}
        public String turned(){return "поехала по лесной целине";}
        public String speed(){return "проехала";}

        @Override
        public String toString(){
                return getName();
        }
        public String go() {
                try {
                        if (Math.random() <= 0.5)
                                return "шел";
                        else
                                throw new NullPointerException();
                } catch (NullPointerException e) {
                        return "не пошел";
                }
        }

        public boolean isBroken() {
                return isBroken;
        }

        public void setBroken(boolean broken) {
                isBroken = broken;
        }
}