package CityIF.animal;

class Mammal extends Animal {
    private int offspring;

    public Mammal(String name, int offspring) {
        super(name);
        this.offspring = offspring;
    }

    public int getNumOffspring() {
        return offspring;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n Avg offspring: " + offspring;
    }
}
