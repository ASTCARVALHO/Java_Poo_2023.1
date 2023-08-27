package ufpb.AntonioSergio.sistemaComercio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaComercioMapTest {
    SistemaComercioMap sistemaComercioMap;
    @BeforeEach
    void setup(){
        this.sistemaComercioMap = new SistemaComercioMap();
    }
    @Test
    void cadastrarEpesquisarProduto(){
        Produto p1 = new Produto("1","arroz", 5.00,10,CategoriaProduto.ALIMENTO);
        Produto p2 = new Produto("2","macarrão", 3.00,10,CategoriaProduto.ALIMENTO);
        sistemaComercioMap.cadastrarProduto(p1);
        sistemaComercioMap.cadastrarProduto(p2);
        assertEquals(2,sistemaComercioMap.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO).size());
        try {
            assertEquals("arroz",sistemaComercioMap.pesquisaProduto("1").getDescricao());
        }catch (ProdutoNaoExisteException e){
            System.out.println(e.getMessage());
        }


    }
    @Test
    void existeProduto() {
    }

    @Test
    void pesquisaProduto() {
    }

    @Test
    void existeCliente() {
    }

    @Test
    void pesquisaCliente() {
    }

    @Test
    void pesquisaProdutosDaCategoria() {
    }
}