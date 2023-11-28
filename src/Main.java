import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AngajatCuExperienta angajat1 = new AngajatCuExperienta("Popescu", "Ioan", 60);
        Intern intern = new Intern("Vasilescu", "Ana", 5);
        Administrator adm = new Administrator("Georgescu", "Mihai", 130);
        System.out.println(angajat1);
        System.out.println(intern);
        System.out.println(adm);
        System.out.println();

        //afiseaza salariul cu doar 2 zecimale
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println(df.format(angajat1.getSalariu()));
        System.out.println(df.format(intern.getSalariu()));
        System.out.println(df.format(adm.getSalariu()));
        System.out.println();
        //TODO: citire din fisier in loc
        //TODO: poate fa o aplicatie de tip meniu
        //TODO: error handling
        ArrayList<Angajat> lista = new ArrayList<>();
        String[] tipuri = new String[]{"A", "A", "A", "I", "I", "M", "M"};
        String[] nume_de_familie = new String[]{"Apetrei", "Popa", "Ilies", "Cristinescu", "Bujor", "Cojocaru", "Vacaru"};
        String[] prenume = new String[]{"Mihai", "Mihaela", "Andreea", "Vasile", "Serban", "Ovidiu", "Sabina"};
        int[] vechimi = new int[]{48, 57, 100, 4, 13, 140, 160};

        for(int i = 0; i < 7; i++){
            lista.add(FabricaAngajati.getAngajat(tipuri[i], nume_de_familie[i], prenume[i], vechimi[i]));
        }

        for(Angajat a : lista){
            System.out.println(a);
        }

        lista.sort(Comparator.comparing(Angajat::getNume).thenComparing(Angajat::getPrenume));
        for(Angajat a : lista) {
            System.out.println(a.getNume() + " " + a.getPrenume());
        }
    }
}
