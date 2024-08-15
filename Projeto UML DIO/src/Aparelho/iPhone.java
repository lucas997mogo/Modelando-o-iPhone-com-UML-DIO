package Aparelho;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {

    }
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void correioVoz() {
        System.out.println("MENSAGEM DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("APARECENDO PÁGINA 01");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("INICIANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("F5 - ATUALIZANDO PÁGINA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NOVA");
    }
}
