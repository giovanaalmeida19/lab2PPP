public class IVehicleSingleton {
    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    private IVehicleSingleton(){}

    public static IVehicleMaker getToyotaInstance(){
        if(toyota == null){
           toyota = new ToyotaFactory();
        }

        return toyota;
    }

    public static IVehicleMaker getHondaInstance(){
        if(honda == null){
            honda = new HondaFactory();
        }

        return honda;
    }

}
