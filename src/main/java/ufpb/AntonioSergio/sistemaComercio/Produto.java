package ufpb.AntonioSergio.sistemaComercio;

import java.util.List;

public class Produto {
   private String codigo;
   private String descricao;
   private double precoVenda;
   private int qntEstoque;
   private CategoriaProduto categoriaProduto;

   public Produto(String codigo, String descricao, double precoVenda, int qntEstoque,CategoriaProduto categoriaProduto) {
      this.codigo = codigo;
      this.descricao = descricao;
      this.precoVenda = precoVenda;
      this.qntEstoque = qntEstoque;
      this.categoriaProduto = categoriaProduto;
   }

   public Produto() {
   }

   public String getCodigo() {
      return codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public double getPrecoVenda() {
      return precoVenda;
   }

   public void setPrecoVenda(double precoVenda) {
      this.precoVenda = precoVenda;
   }

   public int getQntEstoque() {
      return qntEstoque;
   }

   public CategoriaProduto getCategoriaProduto() {
      return categoriaProduto;
   }

   public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
      this.categoriaProduto = categoriaProduto;
   }

   public void setQntEstoque(int qntEstoque) {
      this.qntEstoque = qntEstoque;
   }
}
