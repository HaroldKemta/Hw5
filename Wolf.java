// harold kemta

class Wolf extends Dog {
    private String packLeaderName;

    public Wolf() {
        super(); // callss super class 
        this.packLeaderName = "none";
    }

    public Wolf(String name, double weight, int energyLevel, String packLeaderName) { // constructor 
        super(name, weight, energyLevel);
        this.packLeaderName = (packLeaderName != null) ? packLeaderName : "none";
    }

    @Override // overide dog class 
    public String toString() {
        return super.toString() + ", Pack Leader: " + packLeaderName;
    }
}
