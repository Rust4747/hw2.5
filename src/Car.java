public class Car extends  Transport{


    private TypeBody typeBody;

    public Car(String brand, String model, float enginevolume, TypeBody typeBody) {
        super(brand, model, enginevolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public void printType() {
        if (typeBody==null){
            System.out.println("Данных недостаточно");
        } else {
            System.out.println(typeBody);
        }
    }
}
