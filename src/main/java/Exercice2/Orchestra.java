package Exercice2;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Instrument> Inst = new ArrayList<>();

    public void tune(Instrument i){
        i.play();
    }

    public void tuneAll(){
        for(Instrument i: this.Inst){
            tune(i);
        }

    }
    public void add(Instrument i){
        Inst.add(i);
    }



}
