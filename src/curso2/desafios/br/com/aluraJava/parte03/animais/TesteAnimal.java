package curso2.desafios.br.com.aluraJava.parte03.animais;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato siames = new Gato();

        System.out.println(siames.emitirSom());
        System.out.println(siames.arranharMoveis());

        Cachorro golden = new Cachorro();

        System.out.println(golden.emitirSom());
        System.out.println(golden.abanarRabo());
    }
}
