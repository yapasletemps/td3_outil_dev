public class Music {
	public static void main (String[] args){
		Orchestra orchestra = new Orchestra();
		orchestra.addInstrument(new Percussion());

		orchestra.addInstrument(new Trombone());
		orchestra.addInstrument(new Guitar());
		orchestra.addInstrument(new Violin());
		orchestra.addInstrument(new Flute());
		orchestra.addInstrument(new Trompette());

		orchestra.tuneAll();

		orchestra.tuneTenor(new Trombone());
		orchestra.tuneSoprano(new Violin());
		orchestra.tuneSoprano(new Flute());
		orchestra.tuneTenor(new Guitar());

		orchestra.pauseBrass(new Brass());
	}
}
