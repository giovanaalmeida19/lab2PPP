public class HondaFactory implements IVehicleMaker{
    private String modelo;

    public IVehicle makeVehicle(String modelo){
        if(modelo.equals("Civic")){
            return new Civic();
        } else if (modelo.equals("City")){
            return new City();
        } else {
            return new Fit();
        }
    }
}
