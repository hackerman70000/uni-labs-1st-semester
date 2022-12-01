import java.util.Scanner;

//skomentować kod
public class Student {
    private int rok;
    private int wiek;
    private int id;
    private int stypendium;

    private String wydzial;
    private String kierunek;
    private String imie;
    private String nazwisko;

    public Student(String imieBegin, String nazwiskoBegin, int idBegin, String wydzialBegin, String kierunekBegin, int wiekBegin, int rokBegin, int stypendiumBegin) {

        imie = imieBegin;
        nazwisko = nazwiskoBegin;
        id = idBegin;
        wydzial = wydzialBegin;
        kierunek = kierunekBegin;
        wiek = wiekBegin;
        rok = rokBegin;
        stypendium = stypendiumBegin;
    }


    public static void main(String[] args) {

        Student student324922 = new Student("Jan", "Kos", 324922, "EiTI", "informatyka", 19, 1, 0);
        Scanner sc = new Scanner(System.in);
        int decision = -1;
        System.out.println("0 - end,  1 - get,  2 - set: ");
        while (decision < 0 || decision > 2) {
            decision = sc.nextInt();
        }


        while (decision != 0) {
            if (decision == 1) {
                System.out.println("\n 0 - end get,  1 - all,  2 - get imie, 3 - get nazwisko, 4 - get id, 5 - get wydzial, 6 - get kierunek, 7 - get wiek, 8 - get rok, 9 - get stypendium : ");
                decision = sc.nextInt();
                while (decision < 0 || decision > 9) {
                    decision = sc.nextInt();
                }


                while (decision != 0) {
                    switch (decision) {
                        case 1:
                            System.out.println("Imie : " + student324922.getImie());
                            System.out.println("Nazwisko : " + student324922.getNazwisko());
                            System.out.println("Id : " + student324922.getId());
                            System.out.println("Wydzial : " + student324922.getWydzial());
                            System.out.println("Kierunek : " + student324922.getKierunek());
                            System.out.println("Wiek : " + student324922.getWiek());
                            System.out.println("Rok : " + student324922.getRok());
                            System.out.println("Stypendium : " + student324922.getStypendium());
                            break;
                        case 2:
                            System.out.println("Imie : " + student324922.getImie());
                            break;
                        case 3:
                            System.out.println("Nazwisko : " + student324922.getNazwisko());
                            break;
                        case 4:
                            System.out.println("Id : " + student324922.getId());
                            break;
                        case 5:
                            System.out.println("Wydzial : " + student324922.getWydzial());
                            break;
                        case 6:
                            System.out.println("Kierunek : " + student324922.getKierunek());
                            break;
                        case 7:
                            System.out.println("Wiek : " + student324922.getWiek());
                            break;
                        case 8:
                            System.out.println("Rok : " + student324922.getRok());
                            break;
                        case 9:
                            System.out.println("Stypendium : " + student324922.getStypendium());
                            break;
                    }
                    System.out.println("\n 0 - end get,  1 - all,  2 - get imie, 3 - get nazwisko, 4 - get id, 5 - get wydzial, 6 - get kierunek, 7 - get wiek, 8 - get rok, 9 - get stypendium : ");
                    decision = sc.nextInt();
                    while (decision < 0 || decision > 9) {
                        decision = sc.nextInt();
                    }

                }

                decision = -1;
                System.out.println("\n0 - end,  1 - get,  2 - set: ");
                while (decision < 0 || decision > 2) {
                    decision = sc.nextInt();
                }
            }

            else if (decision == 2) {

                System.out.println("\n0 - end set,  1 - set stypendium ,  2 - set imie, 3 - set nazwisko, 4 - set id, 5 - set wydzial, 6 - set kierunek, 7 - set wiek, 8 - set rok: ");
                decision = sc.nextInt();
                while (decision < 0 || decision > 9) {
                    decision = sc.nextInt();
                }


                while (decision != 0) {
                    System.out.println("Podaj nową wartość : ");
                    switch (decision) {
                        case 1:
                            int newStypendium = sc.nextInt();
                            student324922.setStypendium(newStypendium);
                            break;
                        case 2:
                            String newImie = sc.next();
                            student324922.setImie(newImie);
                            break;
                        case 3:
                            String newNazwisko = sc.next();
                            student324922.setNazwisko(newNazwisko);
                            break;
                        case 4:
                            int newId = sc.nextInt();
                            student324922.setId(newId);
                            break;
                        case 5:
                            String newWydzial = sc.next();
                            student324922.setWydzial(newWydzial);
                            break;
                        case 6:
                            String newKierunek = sc.next();
                            student324922.setKierunek(newKierunek);
                            break;
                        case 7:
                            int newWiek = sc.nextInt();
                            student324922.setWiek(newWiek);
                            break;
                        case 8:
                            int newRok = sc.nextInt();
                            student324922.setRok(newRok);
                            break;

                    }
                    System.out.println("\n0 - end set,  1 - set stypendium ,  2 - set imie, 3 - set nazwisko, 4 - set id, 5 - set wydzial, 6 - set kierunek, 7 - set wiek, 8 - set rok: ");
                    decision = sc.nextInt();
                    while (decision < 0 || decision > 9) {
                        decision = sc.nextInt();
                    }
                }
                decision = -1;
                System.out.println("\n0 - end,  1 - get,  2 - set: ");
                while (decision < 0 || decision > 2) {
                    decision = sc.nextInt();
                }
            }

        }
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

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
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

