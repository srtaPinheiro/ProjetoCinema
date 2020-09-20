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
public class RealidadeVirtual extends Filmes{
    private int fones;
    private int oculos;

    public RealidadeVirtual(int fones, int oculos, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.fones = fones;
        this.oculos = oculos;
    }

    public int getOculos() {
        return oculos;
    }

    public void setOculos(int oculos) {
        this.oculos = oculos;
    }

    public int getFones() {
        return fones;
    }

    public void setFones(int fones) {
        this.fones = fones;
    }
    
    
    
}
