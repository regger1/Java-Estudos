package Mclassesabstratas.dominio;

public abstract class Pessoa {
    public abstract void imprime();
}
// classes abstratas que herdarem dessa classe não precisam incluir os métodos,
// elas tem passe livre pra ignorá-las
// classes concretas precisam herdar tudo dessa classe, no caso o método
// imprime()
