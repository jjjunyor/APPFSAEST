package com.example.anchieta.appfsaest;

public class Produto {
    private int cdProduto;
    private String DescProduto;
    private  String UnidadeMedida ;

    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getDescProduto() {
        return DescProduto;
    }

    public void setDescProduto(String descProduto) {
        DescProduto = descProduto;
    }

    public String getUnidadeMedida() {
        return UnidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        UnidadeMedida = unidadeMedida;
    }

    public Produto(int cdProduto, String descProduto, String unidadeMedida) {

        this.cdProduto = cdProduto;
        DescProduto = descProduto;
        UnidadeMedida = unidadeMedida;
    }
}
