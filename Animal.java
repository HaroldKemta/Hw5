// harold kemta

class Animal {. // base class 
    private String name;
    private double weight;

    public Animal() {
        this.name = "none";
        this.weight = 1.0;
    }

    public Animal(String name, double weight) {
        this.name = (name != null) ? name : "none";
        this.weight = (weight > 0) ? weight : 1.0;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }

    public void setName(String name) { 
        this.name = (name != null) ? name : "none"; 
    }

    public void setWeight(double weight) { 
        this.weight = (weight > 0) ? weight : 1.0; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return name.equalsIgnoreCase(other.name) && weight == other.weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Weight: " + weight;
    }
}
