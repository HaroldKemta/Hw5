// harold kemta


class Dog extends Animal { // extends animal class 
    private int energyLevel;

    public Dog() {
        super();
        this.energyLevel = 50;
    }

    public Dog(String name, double weight, int energyLevel) {
        super(name, weight);
        setEnergyLevel(energyLevel);
    }

    public int getEnergyLevel() { return energyLevel; }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = (energyLevel >= 0 && energyLevel <= 100) ? energyLevel : 50;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof Dog)) return false;
        Dog other = (Dog) obj;
        return energyLevel == other.energyLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Energy Level: " + energyLevel;
    }
}
