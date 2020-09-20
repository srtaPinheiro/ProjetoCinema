/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author User
 */
public class Filmes {
    private String nome ;
    private int genero ; //1- acao ; 2- comedia; 3-romance....
    private int duracao;
    private float preco;
    private String diretor;
    private int indicacao;

    public Filmes(String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.preco = preco;
        this.diretor = diretor;
        this.indicacao = indicacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(int indicacao) {
        this.indicacao = indicacao;
    }
  
    

   
    
}
