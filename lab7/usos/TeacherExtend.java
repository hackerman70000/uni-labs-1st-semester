
public class TeacherExtend extends Person {

    private String tytul;
    private String rola;
    private int nrGabinet;


    public TeacherExtend(String imieBegin, String nazwiskoBegin, int idBegin, String tytulBegin, String rolaBegin, int nrGabinetBegin) {

        super(imieBegin, nazwiskoBegin, idBegin);
        tytul = tytulBegin;
        rola = rolaBegin;
        nrGabinet = nrGabinetBegin;
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

}

