package bank;

public class PersonalData {

    private String imie;
    private String nazwisko;
    private String pesel;


    public PersonalData(String imieBegin, String nazwiskoBegin, String peselBegin) {

        imie = imieBegin;
        nazwisko = nazwiskoBegin;
        pesel = peselBegin;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String newImie) {
        this.imie = newImie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String newNazwisko) {
        this.nazwisko = newNazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String newPesel) {
        this.pesel = newPesel;
    }


}
