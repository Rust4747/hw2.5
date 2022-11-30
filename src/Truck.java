public class Truck extends Transport{


    private Weigth weigth;
    public Truck(String brand, String model, float enginevolume, Weigth weigth) {
        super(brand, model, enginevolume);
        this.weigth = weigth;
    }

    public Weigth getWeigth() {
        return weigth;
    }

    public void setWeigth(Weigth weigth) {
        this.weigth = weigth;
    }

    @Override
    public void printType() {
        if (weigth==null){
            System.out.println("Данных недостаточно ");

        }else {
            String from = weigth.getFrom() == null? "" : "от " +weigth.getFrom();
            String to = weigth.getTo() == null? "" : "от " +weigth.getTo();
            System.out.println(from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("грузовик" + getBrand()+getModel()+"починен");

    }
}
