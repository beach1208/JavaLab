package Lab5;

public class Client {
    public static void main(String[] args) {
        Horse h1 = new BlackHorse("David",200,"Canada");
        Horse h2 = new WhiteHorse("Brandt",300,"USA");
        Horse h3 = new WhiteHorse("Stacy",100,"Japan");

        HorseBarn vanhorse = new HorseBarn(5);
        vanhorse.addHorse(0,h1);
        vanhorse.addHorse(2,h2);
        vanhorse.addHorse(4,h3);

        vanhorse.displaySpaces();;

        System.out.println(vanhorse.findHorseSpace("Brandt"));
        System.out.println("Consolidate");
        vanhorse.consolidate();
        vanhorse.displaySpaces();
    }

}
