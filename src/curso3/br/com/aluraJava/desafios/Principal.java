package curso3.br.com.aluraJava.desafios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa individuo1 = new Pessoa();
        individuo1.setNome("Deyvid");
        individuo1.setAltura(200);
        individuo1.setPeso(116);
        individuo1.setQI(90);
        individuo1.setIdade(18);

        Pessoa individuo2 = new Pessoa();
        individuo2.setNome("Maria");
        individuo2.setAltura(164);
        individuo2.setPeso(54.6);
        individuo2.setQI(130);
        individuo2.setIdade(26);

        Pessoa individuo3 = new Pessoa();
        individuo3.setNome("Pablo");
        individuo3.setAltura(176);
        individuo3.setPeso(81.1);
        individuo3.setQI(54);
        individuo3.setIdade(36);

        listaDePessoas.add(individuo1);
        listaDePessoas.add(individuo2);
        listaDePessoas.add(individuo3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
