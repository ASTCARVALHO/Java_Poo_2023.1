package ufpb.AntonioSergio.sistemaComercio;

import java.text.CollationElementIterator;
import java.util.*;

public class SistemaComercioMap {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercioMap(){
        this.produtos = new HashMap<>();
        this.clientes = new HashMap<>();
    }
    public void cadastrarProduto(Produto produto){
        if(!produtos.containsKey(produto.getCodigo())) produtos.put(produto.getCodigo(),produto);
    }

    public boolean existeProduto(Produto produto){
        if(produtos.containsKey(produto)) return true;
        return false;
    }
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        if (!existeProduto(produtos.get(codigoProduto))) throw new ProdutoNaoExisteException("Produto não existe");
        return produtos.get(codigoProduto);
    }
    public boolean existeCliente(Cliente cliente){
        if(clientes.containsKey(cliente.getId())) return true;
        return false;
    }
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException{
        if(!existeCliente(clientes.get(id))) throw new ClienteNaoExisteException("Cliente não encontrado");
        return clientes.get(id);
    }
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoriaProduto){
        Collection<Produto> produtosDaCategoriaPesquisada = new ArrayList<>();
        for (Map.Entry<String,Produto> entrada : produtos.entrySet()){
            Produto produto = entrada.getValue();
            if (produto.getCategoriaProduto().equals(categoriaProduto)) produtosDaCategoriaPesquisada.add(produto);
        }
        return produtosDaCategoriaPesquisada;
    }
}
