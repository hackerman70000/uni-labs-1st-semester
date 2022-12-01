package furniture;

public abstract class Furniture {
    String description;

    Furniture(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

   }
