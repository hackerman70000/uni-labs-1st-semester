
public class Person {
    private String imie;
    private String nazwisko;
    private int id;

    public Person(String imieBegin, String nazwiskoBegin, int idBegin) {

        imie = imieBegin;
        nazwisko = nazwiskoBegin;
        id = idBegin;

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

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }



}

