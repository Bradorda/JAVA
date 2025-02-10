package CityIF.animal;

class Bird extends Animal {
    private int eggs;
    private boolean nesting;

    public Bird(String name, int eggs, boolean nesting) {
        super(name);
        this.eggs = eggs;
        this.nesting = nesting;
    }

    public int getEggs() {
        return eggs;
    }

    public String buildsNest() {
        return nesting ? "True" : "False";
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n Avg no. eggs: " + eggs + "\n Builds a nest: " + buildsNest();
    }
}
