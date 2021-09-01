package com.company;

public class Pessoa {
     private  String nome;
     private  int idade;
     private  String id;
     private  double peso;
     private  double altura;

    public  Pessoa(){
    }

        public void Pessoa(String nome, int idade, String id) {
            this.nome = nome;
            this.idade = idade;
            this.id = id;
         }

        public  Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        }

        public void mostrarPessoa(){

            System.out.println("NOME:"+nome+" IDADE:"+idade+" ID:"+id+" PESO:"+peso+" ALTURA:"+altura);
        }

        public void cacularIMC( double peso,double altura){
            double imc = peso / (altura * 2);
            System.out.println("Índice de massa corporal (IMC) Nível de peso: "+imc);
            if(imc < 20){
                System.out.println("Baixo peso");
            }else if(imc >= 20 && imc <= 25){
                System.out.println("Peso Saudável");
            }else {
                System.out.println("Sobrepeso");
            }

        }
        public void maiorDeIdade(int idade){
            boolean i = false;
            if(idade >= 18) {
                i = true;
                System.out.println("Maior de Idade");
            }else {
                System.out.println("Menor de Idade");
            }
        }



}
