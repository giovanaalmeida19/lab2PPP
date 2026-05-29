public class ToyotaFactory implements IVehicleMaker{
    private String modelo;

    public IVehicle makeVehicle(String modelo){
        if(modelo.equals("Corolla")){
            return new Corolla();
        } else if (modelo.equals("Hilux")){
            return new Hillux();
        } else {
            return new Etios();
        }
    }
}
