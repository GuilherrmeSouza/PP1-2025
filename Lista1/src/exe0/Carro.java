package exe0;


import javax.swing.*;

public class Carro {
    // variaveis
    // vamos trabalhar com tipo de dados primitivos (letra minuscula) int, float
    public int ano;
    public float velocidade;
    //tipo de dado é uma classe (letra maiuscula) String
    public String marca, modelo;

    //Metodo construtores
    //Sem parametro

    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos
    public void exibirDetalhes(){
        //this representa o objeto que se chama "Metodo"
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca +  " ; Modelo: " + this.modelo + " ; Velocidade " + this.velocidade);
    }
    public void acelerar(float x ){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        if(this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else{
            System.out.println("Frenagem não ocorreu !" );
        }
    }
}
