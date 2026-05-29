public class Main {

    public static void main(String[] args) {
        FabricanteCelular apple = FabricanteCelularSingleton.getFabricaApple();
        FabricanteCelular samsung = FabricanteCelularSingleton.getFabricaSamsung();

        Celular iphoneX = apple.constroiCelular("IPhoneX");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        Celular galaxy8 = samsung.constroiCelular("Galaxy8");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();

        Celular iphoneS = apple.constroiCelular("IPhoneS");
        iphoneS.fazLigacao();
        iphoneS.tiraFoto();

        Celular outroIphoneS = apple.constroiCelular("IPhoneS");
        outroIphoneS.fazLigacao();
        outroIphoneS.tiraFoto();

        Celular galaxy20 = samsung.constroiCelular("Galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();
    }
}
