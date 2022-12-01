package furniture;


public class Table extends Furniture {
    private int legs;

    public int getLegs ()
    {
        return legs;
    }

    public boolean equals(Table obj) {

        System.out.println(obj.getLegs()+" "+ this.getLegs());
        if(obj.getLegs() == this.getLegs())
            return true;

        return false;
    }

    Table(int legs, String description) {
        super(description);
        this.legs = legs;
    }

    public String toString() {
        return "stol " + super.getDescription();
    }
}
