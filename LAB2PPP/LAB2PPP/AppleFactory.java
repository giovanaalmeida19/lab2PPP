public class AppleFactory implements FabricanteCelular{
    protected String modelo;

    public Celular constroiCelular(String modelo){
        if(modelo.equals("IphoneX")){
            return new IphoneX();
        } else {
            return new IphoneS();
        }
    }
}
