package Exercice1;

public class Music {
    public static void main(String[] args){
        Percussion perc = new Percussion();
        Wind wind = new Wind();
        Orchestra orch = new Orchestra();
        Brass brass = new Brass();
        Woodwind woodwind = new Woodwind();

        orch.tuneWind(wind);
        orch.tunePercussion(perc);
        orch.addWind(brass);
        orch.addWind(woodwind);
        orch.tuneAll();


    }
}
