package ufpb.AntonioSergio.sistemaComercio;

import ufpb.AntonioSergio.amigoSecreto.SistemaAmigoMap;
import ufpb.AntonioSergio.lojaTech.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaComercioMap {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercioMap(){
        this.produtos = new HashMap<>();
        this.clientes = new HashMap<>();
    }

    public boolean existeProduto(Produto produto){
        if(produtos.containsKey(produto)) return true;
        return false;
    }
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException{
        Produto produtoPesquisado = null;
        if (! produtos.containsKey(codigoProduto)) throw new ProdutoNaoExisteException();
        else return produtoPesquisado = produtos.get(codigoProduto);
    }
}
