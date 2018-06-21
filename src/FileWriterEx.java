import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rdn = new Random();
        System.out.println("Ilość liczb do wprowadzenia: ");
        int ileLiczb = scn.nextInt();

        double[] tablica = new double[ileLiczb];

        for(int i = 0; i<tablica.length; i++) {
            tablica[i] = rdn.nextDouble()*100;
        }

        for(int i = 0; i<tablica.length; i++) {
            System.out.println(tablica[i]);
        }

        String file = "File.txt";
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for(int i = 0; i<tablica.length; i++) {
                bufferedWriter.write(String.format("%.2f", tablica[i]));
                bufferedWriter.write("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }}}
