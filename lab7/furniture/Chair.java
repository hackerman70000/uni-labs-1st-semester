package furniture;

public class Chair extends Furniture {
    Chair(String description) {
        super(description);
    }

    public String toString() {
        return "krzeslo " + super.getDescription();
    }
}
