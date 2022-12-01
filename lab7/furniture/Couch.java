package furniture;

public class Couch extends Furniture {
    int number;

    Couch(int number, String description) {
        super(description);
        this.number = number;
    }

    public String toString() {
        return number + " kanapy " + super.getDescription();
    }
}
