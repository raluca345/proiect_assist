public class Administrator extends Angajat implements CalculatorSalariu{
    public Administrator(String nume, String prenume, int vechime) {
        super(nume, prenume, vechime);
        this.salariu = calculeazaSalariu();
    }

    @Override
    public double calculeazaSalariu() {
        return SALARIU_DE_BAZA_MANAGER + vechime / 12.0 * 500;
    }
}
