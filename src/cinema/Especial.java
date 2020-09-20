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
public class Especial extends Filmes{
        private int interprete;//tem = 1 ; não tem = 0
        private String nomeInterprete;
        private String cpfinterprete;
        private int descricao;//tem = 1 ; não tem = 0
        private String idiomaDesc;
        private int AudioDescricao; //tem = 1 ; não tem = 0

    public Especial(int interprete, String nomeInterprete, String cpfinterprete, int descricao, String idiomaDesc, int AudioDescricao, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.interprete = interprete;
        this.nomeInterprete = nomeInterprete;
        this.cpfinterprete = cpfinterprete;
        this.descricao = descricao;
        this.idiomaDesc = idiomaDesc;
        this.AudioDescricao = AudioDescricao;
    }

    public Especial(int descricao, String idiomaDesc, int AudioDescricao, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.descricao = descricao;
        this.idiomaDesc = idiomaDesc;
        this.AudioDescricao = AudioDescricao;
    }

    public Especial(int AudioDescricao, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.AudioDescricao = AudioDescricao;
    }

    public Especial(int interprete, String nomeInterprete, String cpfinterprete, int AudioDescricao, String nome, int genero, int duracao, float preco, String diretor, int indicacao) {
        super(nome, genero, duracao, preco, diretor, indicacao);
        this.interprete = interprete;
        this.nomeInterprete = nomeInterprete;
        this.cpfinterprete = cpfinterprete;
        this.AudioDescricao = AudioDescricao;
    }

    public int getAudioDescricao() {
        return AudioDescricao;
    }

    public void setAudioDescricao(int AudioDescricao) {
        this.AudioDescricao = AudioDescricao;
    }

    public int getInterprete() {
        return interprete;
    }

    public void setInterprete(int interprete) {
        this.interprete = interprete;
    }

    public String getNomeInterprete() {
        return nomeInterprete;
    }

    public void setNomeInterprete(String nomeInterprete) {
        this.nomeInterprete = nomeInterprete;
    }

    public String getCpfinterprete() {
        return cpfinterprete;
    }

    public void setCpfinterprete(String cpfinterprete) {
        this.cpfinterprete = cpfinterprete;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public String getIdiomaDesc() {
        return idiomaDesc;
    }

    public void setIdiomaDesc(String idiomaDesc) {
        this.idiomaDesc = idiomaDesc;
    }

    
}
