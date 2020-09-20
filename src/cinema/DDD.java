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
public class DDD extends Filmes {
    private int oculos;

    public DDD(int oculos, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.oculos = oculos;
    }

   
    public int getOculos() {
        return oculos;
    }

    public void setOculos(int oculos) {
        this.oculos = oculos;
    }


    
}
