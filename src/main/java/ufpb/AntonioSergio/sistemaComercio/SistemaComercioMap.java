package ufpb.AntonioSergio.sistemaComercio;

import ufpb.AntonioSergio.amigoSecreto.SistemaAmigoMap;
import ufpb.AntonioSergio.lojaTech.Produto;

import java.util.HashMap;
import java.util.LinkedList;
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
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        Produto produtoPesquisado = null;
        if (!produtos.containsKey(codigoProduto)) throw new ProdutoNaoExisteException("Produto não existe");
        else return produtoPesquisado = produtos.get(codigoProduto);
    }
    public boolean existeCliente(Cliente cliente){
        if(clientes.containsKey(cliente.getId())) return true;
        return false;
    }
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException{
        if(clientes.containsKey(id)) return clientes.get(id);
        else throw new ClienteNaoExisteException("Cliente não existe");
    }
    public List<Produto> pesquisaProdutoDaCategoria(CategoriaProduto categoria){
        List<Produto> produtosPesquisados = new LinkedList<>();
        for(Map.Entry<String,Produto> entry : produtos.entrySet()){
            Produto produto = entry.getValue();
            String codigoProduto = entry.getKey();
            if(produto.)
        }
    }
}
