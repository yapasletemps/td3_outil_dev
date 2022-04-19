package Exercice1;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Wind> Wind = new ArrayList<>();
    private ArrayList<Percussion> Percussion = new ArrayList<>();

    public void tuneWind(Wind wind){

        wind.play();
    }

    public void tunePercussion(Percussion percussion){

        percussion.play();
    }

    public void tuneAll(){
        for(Wind w: this.Wind){
            tuneWind(w);
        }
        for(Percussion p: this.Percussion){
            tunePercussion(p);
        }

    }

    public void addWind(Wind wind){

        this.Wind.add(wind);
    }

    public void addPercussion(Percussion percussion){

        this.Percussion.add(percussion);
    }

}
