import java.util.ArrayList;

public class Orchestra {
	private ArrayList<Instrument> instrument = new ArrayList<>();

	public void tune(Instrument i) {
		i.play();
	}

	public void tuneTenor(Tenor i) {
		i.playLikeATenor();
	}

	public void tuneSoprano(Soprano i) {
		i.playLikeASoprano();
	}

	public void tuneAll() {
		for (Instrument i: instrument) {
			tune(i);
		}
	}

	public void addInstrument(Instrument i) {
		instrument.add(i);
	}

	public void pauseBrass(MakeAPause i) {
		i.pause();
	}
}
