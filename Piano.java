public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing: Plink plink!");
    }

    // Main method to test both instruments
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        System.out.println("Testing musical instruments:");
        guitar.play();
        piano.play();
    }
}
