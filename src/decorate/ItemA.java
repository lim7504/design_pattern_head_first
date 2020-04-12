package decorate;

public class ItemA implements Decorate {

    @Override
    public String getDescription() {
        return "ItemA";
    }

    @Override
    public Integer cost() {
        return 10;
    }
}
