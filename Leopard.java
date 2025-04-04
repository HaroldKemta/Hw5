// harold kemta

class Leopard extends Cat {
    private int numberOfSpots;

    public Leopard() { 
        super();
        this.numberOfSpots = 1;
    }

    public Leopard(String name, double weight, String mood, int numberOfSpots) { // constructor 
        super(name, weight, mood);
        setNumberOfSpots(numberOfSpots);
    }

    public int getNumberOfSpots() { return numberOfSpots; }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = (numberOfSpots >= 1) ? numberOfSpots : 1;
    }

    @Override // override cat class
    public String toString() {
        return super.toString() + ", Number of Spots: " + numberOfSpots;
    }
}
