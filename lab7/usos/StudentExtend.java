
public class StudentExtend extends Person {

    private int rok;
    private int wiek;
    private int stypendium;
    private String wydzial;
    private String kierunek;


    public StudentExtend(String imieBegin, String nazwiskoBegin, int idBegin, String wydzialBegin, String kierunekBegin, int wiekBegin, int rokBegin, int stypendiumBegin) {

        super(imieBegin, nazwiskoBegin, idBegin);
        wydzial = wydzialBegin;
        kierunek = kierunekBegin;
        wiek = wiekBegin;
        rok = rokBegin;
        stypendium = stypendiumBegin;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String newKierunek) {
        this.kierunek = newKierunek;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setWydzial(String newWydzial) {
        this.wydzial = newWydzial;
    }

    public int getStypendium() {
        return stypendium;
    }

    public void setStypendium(int newStypendium) {
        this.stypendium = newStypendium;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int newWiek) {
        this.wiek = newWiek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int newRok) {
        this.rok = newRok;
    }

}

