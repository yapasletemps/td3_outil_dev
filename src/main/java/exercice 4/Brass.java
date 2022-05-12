public class Brass extends Wind implements MakeAPause {
	public void play() {
		System.out.println("Brass.play()");
	}

	public void pause() {
		System.out.println("Brass.pause()");
	}
}
