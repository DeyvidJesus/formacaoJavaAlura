package br.com.aluraJava.desafios.parte03.animais;

public class Gato extends Animal {
    @Override
    public String emitirSom() {
        return "Miau Miau!";
    }

    public String arranharMoveis() {
        return "Scraatch!";
    }
}
