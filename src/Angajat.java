public class Angajat {
    String nume, prenume;
    int varsta, vechime; //in luni
    double salariu;

    public Angajat(String nume, String prenume, int vechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " lucreaza de " + vechime + " luni in acest post";
    }

}
