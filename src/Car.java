public class Car {
    private String modelName;
    private int mileage;

    public Car(String modelName, int mileage){
        this.modelName = modelName;
        this.mileage = mileage;
    }
    @Deprecated
    public void printCarDetails(){
        System.out.println(modelName);
        System.out.println(mileage);
    }

    public void getCarDetails(){
        System.out.println(modelName + " - " + mileage);
    }
}
