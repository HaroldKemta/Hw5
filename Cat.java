// harold kemta

class Cat extends Animal { // override animal class
    private String mood;

    public Cat() {
        super();
        this.mood = "sleepy";
    }

    public Cat(String name, double weight, String mood) {
        super(name, weight);
        setMood(mood);
    }

    public String getMood() { return mood; }

    public void setMood(String mood) {
        if (mood.equalsIgnoreCase("sleepy") || mood.equalsIgnoreCase("playful") || mood.equalsIgnoreCase("hungry")) {
            this.mood = mood;
        } else {
            this.mood = "sleepy";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof Cat)) return false;
        Cat other = (Cat) obj;
        return mood.equalsIgnoreCase(other.mood);
    }

    @Override
    public String toString() {
        return super.toString() + ", Mood: " + mood;
    }
}
