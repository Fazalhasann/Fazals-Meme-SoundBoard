import javax.sound.sampled.*;
import java.io.File;
import java.util.HashMap;

public class SoundManager {

    private HashMap<String, Clip> soundClips = new HashMap<>();
    private Clip currentClip;

    public void preload(String fileName) {
        try {
            File soundFile = new File("Sounds/" + fileName);
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            soundClips.put(fileName, clip);
        } catch (Exception e) {
            System.out.println("Could not load sound: " + fileName);
        }
    }

    public void play(String fileName) {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop();
            currentClip.setFramePosition(0);
        }

        Clip clip = soundClips.get(fileName);

        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
            currentClip = clip;
        }
    }

    public void stop() {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop();
            currentClip.setFramePosition(0);
        }
    }
}