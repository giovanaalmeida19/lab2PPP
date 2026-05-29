public class SamsungFactory implements FabricanteCelular {
    protected String modelo;

    public Celular constroiCelular(String modelo){
        if(modelo.equals("Galaxy8")){
            return new Galaxy8();
        } else {
            return new Galaxy20();
        }
    }
}
