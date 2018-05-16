package Lab4;

import java.util.ArrayList;
import java.util.Collections;

public class Employees {
   public ArrayList<HockeyPlayer> hockeyPlayer = new ArrayList();
   public ArrayList<Professor> professor = new ArrayList();
   public ArrayList<Parent> parent = new ArrayList();
   public ArrayList<GasStationAttendant> gas = new ArrayList();


    public Employees() {
        hockeyPlayer.add(new HockeyPlayer("Wayne Gretzky",894));
        hockeyPlayer.add(new HockeyPlayer("Who Ever",0));
        hockeyPlayer.add(new HockeyPlayer("Brent Gretzky",1));
        hockeyPlayer.add(new HockeyPlayer("Pavel Bure",437));
        hockeyPlayer.add(new HockeyPlayer("Jason Bourne",0));

        professor.add(new Professor("Albert Einstein","Physics"));
        professor.add(new Professor("Alan Turing","Computer Systems"));
        professor.add(new Professor("Richard Feynman","Physics"));
        professor.add(new Professor("Tim Berners-Lee","Computer Systems"));
        professor.add(new Professor("Kurt Godel","Logic"));


        parent.add(new Parent("Tiger Woods", 1));
        parent.add(new Parent("Super Mom", 168));
        parent.add(new Parent("Lazy Larry", 20));
        parent.add(new Parent("Ex Hausted", 168));
        parent.add(new Parent("Super Dad", 167));

        gas.add(new GasStationAttendant("Joe Smith",10));
        gas.add(new GasStationAttendant("Tony Beloney",100));
        gas.add(new GasStationAttendant("Benjamin Franklin",100));
        gas.add(new GasStationAttendant("Mary Fairy",101));
        gas.add(new GasStationAttendant("Bee See",1));



    }

    public void CorrectionSort(){
        Collections.sort(hockeyPlayer);
        Collections.sort(professor);
        Collections.sort(parent);
        Collections.sort(gas);
    }

    //hockey player
    public void hockeyPrint(){
        for (int i = 0; i < hockeyPlayer.size(); i++){
            System.out.printf("Hockey Player %20s  %20s", hockeyPlayer.get(i).name,  hockeyPlayer.get(i).getNumberOfGoals() + " goals\n");
        }
    }

    public void professorPrint(){
        for (int i = 0; i < professor.size(); i++){
            System.out.printf("Professor %20s Teaches %20s", professor.get(i).name,  professor.get(i).getTeachingMajor()+"\n");
        }

    }

    public void parentPrint(){
        for (int i = 0; i < parent.size(); i++){
            System.out.printf("Parent %20s spends %20s hours/week with kids \n" , parent.get(i).name, parent.get(i).getNumberOfHoursSpentPerWeekWithKids());
        }
    }

    public void gasPrint(){
        for (int i = 0; i < gas.size(); i++){
            System.out.printf("Gas Station Attendant %20s steals %20s dollars a day \n ",gas.get(i).name,gas.get(i).getNumberOfDollarsStolenPerDay());
        }
    }

}

