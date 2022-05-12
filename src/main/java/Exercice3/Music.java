package Exercice3;

public class Music {
    public static void main(String[] args){
        Percussion perc = new Percussion();
        Wind wind = new Wind();
        Orchestra orch = new Orchestra();
        Brass brass = new Brass();
        Woodwind woodwind = new Woodwind();

        orch.tune(wind);
        orch.tune(perc);
        orch.add(brass);
        orch.add(woodwind);
        orch.tuneAll();
        orch.tune(new Stringed());
        //afin de séparer les instrument et les types d'instrument les instruments seront dans la liste et les type d'instrument seront joué avec la méthode tune


    }
}
