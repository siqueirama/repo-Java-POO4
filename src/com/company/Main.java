package com.company;

public class Main {

    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa("Caio",11,"007245723",76.5,1.84);
 //    Não é possivle, chamar o metodo sem passar todos os paramentor esperados. "java: illegal start of expression"
 //     Pessoa pessoa1 = new Pessoa("Joao",,"008569741");
        pessoa.mostrarPessoa();
//      pessoa1.mostrarPessoa();
        pessoa.cacularIMC(76.5,1.84);
        pessoa.maiorDeIdade(11);

    }
}
