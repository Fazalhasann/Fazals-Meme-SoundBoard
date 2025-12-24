public class Main {
    public static void main(String[] args) {
        SoundManager soundManager = new SoundManager();

        soundManager.preload("Bruh.wav");
        soundManager.preload("Awkward sound effect.wav");
        soundManager.preload("Dexter sus audio.wav");
        soundManager.preload("Fake audience laughter.wav");
        soundManager.preload("Fart.wav");
        soundManager.preload("we will be right back.wav");
        soundManager.preload("fahh.wav");
        soundManager.preload("rizz.wav");
        soundManager.preload("fbi open up.wav");

        SoundBoardUserInterface ui = new SoundBoardUserInterface(soundManager);
        ui.build();
    }
}