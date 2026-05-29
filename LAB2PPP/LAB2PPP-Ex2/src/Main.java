//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    IVehicleMaker honda = IVehicleSingleton.getHondaInstance();
    IVehicleMaker toyota = IVehicleSingleton.getToyotaInstance();

    IVehicle city = honda.makeVehicle("City");
    city.start();
    city.drive();
    city.stop();

    IVehicle civic = honda.makeVehicle("Civic");
    civic.start();
    civic.drive();
    civic.stop();

    IVehicle fit = honda.makeVehicle("Fit");
    fit.start();
    fit.drive();
    fit.stop();

    IVehicle corolla = toyota.makeVehicle("Corolla");
    corolla.start();
    corolla.drive();
    corolla.stop();

    IVehicle etios = toyota.makeVehicle("Etios");
    etios.start();
    etios.drive();
    etios.stop();

    IVehicle hillux = toyota.makeVehicle("Hillux");
    hillux.start();
    hillux.drive();
    hillux.stop();
}

