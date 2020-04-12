package decorate;

public class Option2 implements Decorate {

    Decorate decorate;

    public Option2(Decorate decorate) {
       this.decorate = decorate;
    }

    @Override
    public String getDescription() {
        return decorate.getDescription() + ", Option2";
    }

    @Override
    public Integer cost() {
        return this.decorate.cost() + 3;
    }
}
