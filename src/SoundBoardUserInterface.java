import javax.swing.*;
import java.awt.*;

public class SoundBoardUserInterface {

    private SoundManager soundManager;

    public SoundBoardUserInterface(SoundManager soundManager) {
        this.soundManager = soundManager;
    }

    public void build() {
        JFrame frame = new JFrame("Fazal's Meme Soundboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel wrapper = new JPanel(new GridLayout(3, 2, 15, 15));
        wrapper.setBackground(new Color(30, 30, 30));
        wrapper.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        wrapper.add(createButton("Bruh", "Bruh.wav", new Color(231, 76, 60)));
        wrapper.add(createButton("Awkward", "Awkward sound effect.wav", new Color(46, 204, 113)));
        wrapper.add(createButton("Dexter Sus", "Dexter sus audio.wav", new Color(52, 152, 219)));
        wrapper.add(createButton("Fake Laugh", "Fake audience laughter.wav", new Color(155, 89, 182)));
        wrapper.add(createButton("Fart", "Fart.wav", new Color(241, 196, 15)));
        wrapper.add(createButton("Be Right Back", "we will be right back.wav", new Color(230, 126, 34)));
        wrapper.add(createButton("Fahh", "fahh.wav", new Color(52, 73, 94)));
        wrapper.add(createButton("Rizz", "rizz.wav", new Color(236, 72, 153)));
        wrapper.add(createButton("FBI Open Up", "fbi open up.wav", new Color(20, 184, 166)));

        frame.add(wrapper);
        frame.setVisible(true);
    }

    private JButton createButton(String label, String soundFile, Color bgColor) {
        JButton button = new JButton(label);
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        button.addActionListener(e -> soundManager.play(soundFile));

        return button;
    }
}