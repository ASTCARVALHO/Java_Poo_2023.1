package ufpb.AntonioSergio.sistemaComercio;

import java.util.*;

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
    public List<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoriaProduto){
        List<Produto> produtosDaCategoriaPesquisada = new ArrayList<>();
        for (Map.Entry<String,Produto> entrada : produtos.entrySet()){
            Produto produto = entrada.getValue();
            if (produto.getCategoriaProduto().equals(categoriaProduto)) produtosDaCategoriaPesquisada.add(produto);
        }
        return produtosDaCategoriaPesquisada;
    }
}
