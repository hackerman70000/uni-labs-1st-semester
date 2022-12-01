
public class Teacher {
    
    private String imie;
    private String nazwisko;
    private String tytul;
    private String rola;
    private int nrGabinet;
    private int id;


    public Teacher(String imieBegin, String nazwiskoBegin, int idBegin, String tytulBegin, String rolaBegin, int nrGabinetBegin) {

        imie = imieBegin;
        nazwisko = nazwiskoBegin;
        id = idBegin;
        tytul = tytulBegin;
        rola = rolaBegin;
        nrGabinet = nrGabinetBegin;

    }

    public static void main(String[] args) {

        Teacher teacher324922 = new Teacher("Jan", "Kos", 324922, "inżynier", "asystent", 19);
       
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

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String newTytul) {
        this.tytul = newTytul;
    }

    public String getRola() {
        return rola;
    }

    public void setWydzial(String newRola) {
        this.rola = newRola;
    }

    public int getNrGabinet() {
        return nrGabinet;
    }

    public void setNrGabinet(int newNrGabinet) {
        this.nrGabinet = newNrGabinet;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }



}

