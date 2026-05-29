public class FabricanteCelularSingleton {
    private static FabricanteCelular samsung;
    private static FabricanteCelular apple;

    public static FabricanteCelular getFabricaSamsung(){
        if(samsung == null){
            samsung = new SamsungFactory();
        }

        return samsung;
    }

    public static FabricanteCelular getFabricaApple(){
        if(apple == null){
            apple = new AppleFactory();
        }
        return apple;
    }


}
