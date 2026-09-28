package Mclassesabstratas.dominio;

// é uma classe que foi feita exclusivamente pra ser herdada (uma superclasse)
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
    // método abstrato, n tem nd dentro e so serve pra herdar o nome do método pra
    // outras classes usarem
    // métodos abstratos só podem ser feitos em classes abstratas
    // classe abstrata podem ter métodos abstratos e concretos

}
