/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import com.mysql.jdbc.Blob;

/**
 *
 * @author Mauricio
 */
public class Estabelecimento {
    private int Id;
    private String Nome;
    private String Endereco;
    private String Tipo;
    private String Descricao;
    private int Ranking;
    private String Cervejas;
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    
    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the Ranking
     */
    public int getRanking() {
        return Ranking;
    }

    /**
     * @param Ranking the Ranking to set
     */
    public void setRanking(int Ranking) {
        this.Ranking = Ranking;
    }

    
    /**
     * @return the Promocao_id
     */
    public String getCervejas() {
        return Cervejas;
    }

    /**
     * @param Cervejas the Promocao_id to set
     */
    public void setCervejas(String Cervejas) {
        this.Cervejas = Cervejas;
    }

}
