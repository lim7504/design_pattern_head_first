package decorate;



public class Option1 implements Decorate {
    Decorate decorate;

    public Option1(Decorate decorate) {
        this.decorate = decorate;
    }

    @Override
    public String getDescription() {
        return this.decorate.getDescription() + ", Option1";
    }

    @Override
    public Integer cost() {
        return this.decorate.cost() + 5;
    }
}
