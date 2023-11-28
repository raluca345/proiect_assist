public class FabricaAngajati {
    public static Angajat getAngajat(String tip, String nume, String prenume, int vechime){
        switch(tip.toUpperCase()) {
            case "A":
                return new AngajatCuExperienta(nume, prenume, vechime);
            case "M":
                return new Administrator(nume, prenume, vechime);

            case "I":
                if(vechime > 12){
                    System.out.println("Daca are mai mult de 12 luni experienta, nu mai este intern, ci angajat!");
                    return new AngajatCuExperienta(nume, prenume, vechime);
                }
                else{
                    return new Intern(nume, prenume, vechime);
                }
        }
        return null;
    }
}
