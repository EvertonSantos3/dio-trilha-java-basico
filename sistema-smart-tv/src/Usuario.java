public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.mudardeCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);
    }

    
}