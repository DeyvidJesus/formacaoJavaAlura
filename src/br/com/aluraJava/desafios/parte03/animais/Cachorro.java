package br.com.aluraJava.desafios.parte03.animais;

public class Cachorro extends Animal {
    @Override
    public String emitirSom() {
        return "Au Au!";
    }

    public String abanarRabo() {
        return "Abanando o rabo";
    }
}
