public class Bicycle extends Transport implements HasTyres {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        checkTyres(this);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
}
