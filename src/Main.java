import edu.dio.poo.models.iPhone;

public class Main {
    public static void main(String[] args) {

        iPhone celular = new iPhone("00000-0000");

        celular.ligarAparelho();
        celular.atender();
        celular.selecionarMusica("Perfect");
        celular.desligarAparelho();

    }
}