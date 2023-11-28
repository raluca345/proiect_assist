public class AngajatCuExperienta extends Angajat implements CalculatorSalariu{

    public AngajatCuExperienta(String nume, String prenume, int vechime) {
        super(nume, prenume, vechime);
        this.salariu = calculeazaSalariu();
    }

    @Override
    public double calculeazaSalariu() {
        return SALARIU_DE_BAZA_ANGAJAT_CU_EXPERIENTA + vechime / 12.0 * 500;
    }
}
