package edu.danilton.metodos;

public class Usuario {
    public static void main(String[] args) {
        
        //Criar um objeto SmartTv
        SmartTv smartTv = new SmartTv();

        //Imprimir seus estados antes de alterar
        System.out.println("TV LIGADA: " + smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " + smartTv.volume);

        //chamar o metódo ligar e ver o seu estado
        smartTv.ligar();
        System.out.println("TV LIDADA: " + smartTv.ligada);

        //Aumentar volume e exibir
        smartTv.aumentarVolume();
        System.out.println("VOLUM,E: " + smartTv.volume);
        
        //diminuir volume e exibir
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("VOLUME: " + smartTv.volume);

        //Aumentar canal
        smartTv.aumentarCanal();
        System.out.println("CANAL: " + smartTv.canal);
        
        //Dimiuir canal
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("CANAL: " + smartTv.canal);

        //Definir canal
        smartTv.definirCanal(13);
        System.out.println("CANAL: " + smartTv.canal);
        
    }
}
