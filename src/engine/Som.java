package engine;

import java.applet.AudioClip;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Som {

    private AudioClip audio;

    // roda um som
    public void Play(String arquivo, boolean loop) {

        URL url = getClass().getResource(arquivo);

        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();

            if (loop) {

                clip.loop(Clip.LOOP_CONTINUOUSLY);

            }

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {

        }

    }

}
