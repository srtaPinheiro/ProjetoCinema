/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.io.InputStream;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class TocarWav {
    
    private AudioStream audioStream;
    private ContinuousAudioDataStream continuousaudiostream;
    
    public void play(String audio){
        
        try {
            InputStream inputStream = getClass().getResourceAsStream(audio);
            audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (Exception ex) {
            System.out.println("DEU ERRO: "+ex);
        }
        
    }
    
    public void loop(String audio) {
        
        try{
            InputStream inputStream = getClass().getResourceAsStream(audio);
            audioStream = new AudioStream(inputStream);
            AudioData audiodata = audioStream.getData();
            continuousaudiostream = new ContinuousAudioDataStream(audiodata);
            AudioPlayer.player.start(continuousaudiostream);
        } catch (Exception ex) {
            System.out.println("DEU ERRO: "+ex);
        }
        
    }
    
    public void stop() {
        if (audioStream != null)
            AudioPlayer.player.stop(audioStream);
        if (continuousaudiostream != null)
            AudioPlayer.player.stop(continuousaudiostream);
  }
    
}

