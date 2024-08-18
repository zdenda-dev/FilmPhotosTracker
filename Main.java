package me.astrozdenek;

import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Uložení všech fotek do proměnné
        String allPhotos = "";

        // Output číslo
        String outputName = JOptionPane.showInputDialog("Enter series name:");
        JOptionPane.showMessageDialog(null, "The series name is going to be a name of an output.txt file.");

        // Záznamy - fotky
        String photo1 = JOptionPane.showInputDialog("Any new photos?");
        allPhotos+= photo1;
        JOptionPane.showMessageDialog(null, "All photos: " + allPhotos);

        String photo2 = JOptionPane.showInputDialog("Any new photos?");
        allPhotos+= ", " + photo2;
        JOptionPane.showMessageDialog(null, "All photos: " + allPhotos);

        String photo3 = JOptionPane.showInputDialog("Any new photos?");
        allPhotos+= ", " + photo3;
        JOptionPane.showMessageDialog(null, "All photos: " + allPhotos);

        String photo4 = JOptionPane.showInputDialog("Any new photos?");
        allPhotos+= ", " + photo4;
        JOptionPane.showMessageDialog(null, "All photos: " + allPhotos);

        String photo5 = JOptionPane.showInputDialog("Any new photos?");
        allPhotos+= ", " + photo5;
        JOptionPane.showMessageDialog(null, "Your film is empty! All photos: " + allPhotos);



        // Uložení do output souboru
        PrintWriter writer = new PrintWriter(  outputName + ".txt");
        writer.println("All photos: " + allPhotos);
        writer.close();

    }
}