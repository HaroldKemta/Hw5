// harold kemta

class HouseCat extends Cat {
    private String type;

    public HouseCat() {
        super();
        this.type = "short hair";
    }

    public HouseCat(String name, double weight, String mood, String type) { // constuctor
        super(name, weight, mood);
        setType(type);
    }

    public String getType() { return type; }

    public void setType(String type) { // setter 
        if (type.equalsIgnoreCase("short hair") || type.equalsIgnoreCase("ragdoll") ||
            type.equalsIgnoreCase("sphinx") || type.equalsIgnoreCase("Scottish fold")) {
            this.type = type;
        } else {
            this.type = "short hair";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof HouseCat)) return false;
        HouseCat other = (HouseCat) obj;
        return type.equalsIgnoreCase(other.type);
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
