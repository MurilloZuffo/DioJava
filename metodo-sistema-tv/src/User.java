public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV esta ligada? " + smartTv.power);
        System.out.println("Qual o Canal atual? " + smartTv.channel);
        System.out.println("Qual o volume? " + smartTv.volume);


        smartTv.turnOn();
        System.out.println("TV esta ligada? " + smartTv.power);


        smartTv.turnOff();
        System.out.println("TV esta ligada? " + smartTv.power);

        smartTv.higherVolume();
        smartTv.higherVolume();
        smartTv.higherVolume();
        System.out.println("Qual o volume? " + smartTv.volume);


        smartTv.lowerVolume();
        System.out.println("Qual o volume? " + smartTv.volume);


        smartTv.changeChannel(4);
        System.out.println("Qual o Canal atual? " + smartTv.channel);

        smartTv.channelUp();
        System.out.println("Canal trocado para " + smartTv.channel);

        smartTv.channelDown();
        System.out.println("Canal trocado para " + smartTv.channel);
    }
}
