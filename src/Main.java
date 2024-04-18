import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {


        Scanner scanner = new Scanner(System.in);
        File file = new File("kaleo-way-down-we-go-official-music-video-made-with-Voicemod.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);



        String response = "";
        System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            while(!response.equals("Q")) {

            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();
            switch(response) {

                case "P": clip.start();
                break;

                case "S": clip.stop();
                break;

                case "R": clip.setMicrosecondPosition(30);
                break;

                case "Q": clip.close();
                break;

                default: System.out.println("Not a valid choice");

            }



}System.out.println("Bye");
    }
}