public class Intern extends Angajat implements CalculatorSalariu{
    public Intern(String nume, String prenume, int vechime) {
        super(nume, prenume, vechime);
        this.salariu = calculeazaSalariu();
    }

    @Override
    public double calculeazaSalariu() {
        return SALARIU_DE_BAZA_INTERN + vechime / 12.0 * 100;
    }
}
