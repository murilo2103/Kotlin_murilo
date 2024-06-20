package com.example.restaurantenovo.model

class Food(
    private var imagem: Int,
    private var nome: String,
    private var descricao: String,
    private var preco: String
) {
    fun getImagem(): Int {
        return imagem
    }
    fun setImagem(newImagem: Int) {
        imagem = newImagem
    }
    fun getNome(): String {
        return nome
    }
    fun setNome(newNome: String) {
        nome = newNome
    }
    fun getDescricao(): String {
        return descricao
    }
    fun setDescricao(newDescricao: String) {
        descricao = newDescricao
    }
    fun getPreco(): String {
        return preco
    }
    fun setPreco(newPreco: String) {
        preco = newPreco
    }
}