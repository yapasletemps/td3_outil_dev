package Exercice3;

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

    public void tuneTenor(Soloist i) {
        i.playLikeATenor();
    }
    public void tuneSoprano(Soloist i) {
        i.playLikeASoprano();
    }

}
