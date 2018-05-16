package Lab5;

public class HorseBarn {
    private Horse[] spaces;


    /**
     * Constructor that takes a size and initialize a new horse array
     * @param size
     */
    public HorseBarn(int size){
        this.spaces = new Horse[size];

    }

    /**
     * Add a new horse at the specified index
     * @param index
     * @param horse
     */
    public void addHorse(int index,Horse horse){
        if(index >= 0 && index < this.spaces.length){
            if(this.spaces[index] == null){
                this.spaces[index] = horse;
            }else{
                System.out.println("There is already a horse at the index " + index);
            }
        }else {
            System.out.println("Wrong Index");
        }
    }


    /**
     *
     * @param name
     * @return
     */
    public int findHorseSpace(String name){
        for (int i = 0; i < spaces.length; i++){
            if (this.spaces != null && this.spaces[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void consolidate(){
        //this.spaces = {Horse,null,Horse,null,null,Horse}
        //newspaces= {Horse,Horse,Horse,null,null}
        Horse[] newSpaces = new Horse[this.spaces.length];
        int i_new = 0;
        int i_old = 0;
        while(i_old < this.spaces.length){
            if(this.spaces[i_old] != null){
                newSpaces[i_new] = this.spaces[i_old];
                i_new++;
                i_old++;
            }else{
                i_old++;
            }
        }
        this.spaces = newSpaces;
    }

    public void displaySpaces(){
        for (Horse horse: spaces){
            System.out.println(horse);
        }
    }


}
