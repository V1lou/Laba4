import Class.*;
import Interface.Eat;


public class Main {

    static public int RandomHeight(int a, int b) {
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        return random_number1;
    }
    public static void main(String[] args) {
        MrSkuperfield mrSkuperfield = new MrSkuperfield("Мистер Скуперфильд");
        MrKrabs mrKrabs = new MrKrabs("Мистер Крабс");
        Car car = new Car("машина");
        MoonPlants kedri = new MoonPlants("кедры", RandomHeight(1, 25));
        MoonPlants dubi = new MoonPlants("дубы", RandomHeight(1, 25));
        MoonPlants kashtani = new MoonPlants("каштаны", RandomHeight(1, 25));
        MoonPlants bambuk = new MoonPlants("бамбук", RandomHeight(1, 25));
        EarthPlants earthTrees = new EarthPlants("земные растения", RandomHeight(27, 45));
        Wood wood = new Wood("деревья");
        They they = new They(mrKrabs.getName() + " и " + mrSkuperfield.getName());
        WhiteBirds whiteBirds = new WhiteBirds("Белые гуси и белоснежные птицы");
        Sprouts sprouts = new Sprouts("Спрутс");
        Herd herd = new Herd("стадом овец и коз");

        enum plants1 {кедры, дубы, каштаны, бамбук, земные_растения}
        String allOut1 = "";
        for (plants1 myVar : plants1.values())
            if (myVar == plants1.земные_растения){ allOut1 += myVar; }
            else { allOut1 += myVar + ", "; }

        enum plants2 {луг, пруд, лилии, кувшинки}
        String allOut2 = "";
        for (plants2 myVar : plants2.values())
            if (myVar == plants2.кувшинки){ allOut2 += myVar; }
            else { allOut2 += myVar + ", "; }

        enum plants3 {подсолнечник, гречиху, пшеницу, деревеню, сады, огороды}
        String allOut3 = "";
        for (plants3 myVar : plants3.values())
            if (myVar == plants3.огороды){ allOut3 += myVar; }
            else { allOut3 += myVar + ", "; }

        MrSkuperfield.Danger game = new MrSkuperfield.Danger();

        Eat food = new Eat() {
            @Override
            public String eat() { return("Едят"); }
        };

        // Вывод

        System.out.println(mrKrabs.toString() + " " + mrKrabs.listen() + mrSkuperfield.toString() + "а и " + mrKrabs.sad() + ": " + mrSkuperfield.toString() + game.about() + ".");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.said() + ", что " + mrSkuperfield.pay() + "и " + mrSkuperfield.escaped() + ".");
        System.out.println(sprouts.toString() + " " + sprouts.knew() + sprouts.getLetter() + "о " + mrSkuperfield.toString() + "е в телеграмме " + mrKrabs.toString() + "а.");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.dressed() + ".");
        System.out.println(they.toString() + " " + they.moved() + "на " + car.movedE() + " по городу.");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.happy() + ": " + mrSkuperfield.moved() + " " + car.movedE() + ", " + mrSkuperfield.eat() + mrSkuperfield.talk() + ".");
        System.out.println(mrKrabs.toString() + " " + mrKrabs.drived(car.movedU()) + " из города.");
        System.out.println("М" + car.toString().substring(1,6) + " " + car.speed() + " " + allOut3 + ".");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.turned() + " и " + mrSkuperfield.grew() + " " + herd.toString() + ".");
        System.out.println(mrKrabs.toString() + " " + mrKrabs.happy() + ".");
        System.out.println("М" + car.toString().substring(1,6) + " " + car.turned() + " и виднелись " + allOut2 + ".");
        System.out.println(whiteBirds.toString() + " " + whiteBirds.swim() + ".");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.happy() + " и " + mrSkuperfield.muted() + ".");

        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.fidgeted() + ". ");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.wanted() + mrSkuperfield.see() + ", " + mrSkuperfield.caress() + "медвежонка.");
        System.out.print(mrKrabs.toString() + " " + mrKrabs.turned() + ", " + mrKrabs.drived(car.movedU()) + " на лесную дорогу, где " + kedri.overshadow() + " ");
        System.out.println(allOut1 + ".");

        if ((kedri.getHeight() < earthTrees.getHeight()) && (dubi.getHeight() < earthTrees.getHeight()) && (kashtani.getHeight() < earthTrees.getHeight()) && (bambuk.getHeight() < earthTrees.getHeight())) {

            System.out.println("Лунные растения: " + kedri.toString() + ", " + dubi.toString() + ", " + kashtani.toString() + ", " + bambuk.toString() + " меньше, чем " + earthTrees.toString() + ".");}
        System.out.print(mrKrabs.getName() + " " + mrKrabs.choosed() + ", где " + wood.getName() + " " + wood.grew());
        System.out.println(", " + mrKrabs.speed() + ", " + mrKrabs.ruder() + ", и " + car.moved() + ".");
        //

        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.knew() + "— " + car.toString() + " " + car.turned() + ".");
        System.out.println(mrKrabs.toString() + " " + mrKrabs.muted() + car.movedU() + ", " + mrKrabs.open(true) + "капот, багажник и " + mrKrabs.fix() + car.movedU() + ".");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.choosed() +  car.movedI() + ".");
        System.out.println(mrKrabs.toString() + " " + mrKrabs.see() + ", " + mrKrabs.open(false) + car.movedU() + ".");
        System.out.println(they.toString() + " " + they.turned() + ".");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.sad() + ".");
        System.out.println(mrKrabs.aboutKrabs() + ".");
    }


}
