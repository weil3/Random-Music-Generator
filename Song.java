/*
   _____                   
  / ____|                  
 | (___   ___  _ __   __ _ 
  \___ \ / _ \| '_ \ / _` |
  ____) | (_) | | | | (_| |
 |_____/ \___/|_| |_|\__, |
                      __/ |
                     |___/ 
A class which creates a single song, which can be passed to a player and played.
Accepts patterns from various pattern generators, the rulesets, and stitches them
together using certain rules. 

These rules are defined as:
1. Concatenate all patterns together.
*/
import java.util.ArrayList;
import org.jfugue.pattern.Pattern;

public class Song {
   String song; // Formatted as a JFugue string 

   public Song() {
      song = "";
   }
   
   public Song(String s) {
      song = s;
   }
   
   public boolean AcceptPatterns(ArrayList<Pattern> patternBank) {
      String newSong = "";
      for(int i = 0; i < patternBank.size(); i++) {
         newSong = newSong + patternBank.get(i);
      }
      if(!newSong.equals("")) {
         SetSong(newSong);
         return true;
      }
      return false;
   }
   
   private void SetSong(String s) {
      song = s;
   }
   
   public String GetSong() {
      return song;
   }
}