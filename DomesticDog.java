// Harold kemta

class DomesticDog extends Dog {
    private String type;

    public DomesticDog() {
        super();
        this.type = "retriever";
    }

    public DomesticDog(String name, double weight, int energyLevel, String type) { // constructor 
        super(name, weight, energyLevel);
        setType(type);
    }

    public String getType() { return type; }

    public void setType(String type) {
        if (type.equalsIgnoreCase("retriever") || type.equalsIgnoreCase("terrier") ||
            type.equalsIgnoreCase("husky") || type.equalsIgnoreCase("mutt")) {
            this.type = type;
        } else {
            this.type = "retriever";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
