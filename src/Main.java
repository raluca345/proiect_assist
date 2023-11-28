import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*AngajatCuExperienta angajat1 = new AngajatCuExperienta("Popescu", "Ioan", 60);
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
        System.out.println();*/
        //TODO: poate fa o aplicatie de tip meniu
        //TODO: error handling
        ArrayList<Angajat> lista = new ArrayList<>();
        String[] tipuri = new String[]{};

        try {
            Scanner sc = new Scanner(Paths.get("angajati.txt"));
            //citeste tipurile si creeaza angajati folosind clasa FabricaAngajati
            tipuri = sc.nextLine().strip().split(",");
            int i = 0;
            while (sc.hasNextLine()){
                String[] linie = sc.nextLine().strip().split(",");
                lista.add(FabricaAngajati.getAngajat(tipuri[i],linie[0], linie[1], Integer.parseInt(linie[2])));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Angajat a : lista){
            System.out.println(a);
        }
    }
}
