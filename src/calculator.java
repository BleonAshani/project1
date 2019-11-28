import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//need http://www.javazoom.net/javalayer/sources.html
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class calculator {
    public static void main(String[] args) {

        CalculatorGUI calc = new CalculatorGUI();

        //code adapted from https://www.youtube.com/watch?v=oFs7FPpf5-w and got help from Conor Hartigan (Software Dev 2nd year)
        try {
            //song gotten from https://www.youtube.com/watch?v=VVggXZPCuYw
            FileInputStream musicToBePlayed = new FileInputStream("music/song.mp3");

            //creates a new player object called "player"
            Player player = new Player(musicToBePlayed);

            //just for confirmation that the song is playing for when muted
            System.out.println("Song is playing...");

            //plays song
            player.play();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error! File not found!");
        }
        catch (JavaLayerException e) {
            System.out.println("Error! Java Layer Exception!!");
        }



    }
}
