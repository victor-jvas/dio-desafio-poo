package edu.dio.poo.models;

import edu.dio.poo.interfaces.AparelhoTelefonico;
import edu.dio.poo.interfaces.NavegadorInternet;
import edu.dio.poo.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public String numero;

    public iPhone(String numero){
        this.numero = numero;
    }

    public void ligarAparelho(){
        System.out.println("Aparelho Ligado");
    }
    public void desligarAparelho(){
        System.out.println("Aparelho Desligado");
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligacao.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando musica: " + musica);
    }
}
