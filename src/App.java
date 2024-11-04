import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Preto");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Branco");
        gato.miar();
        gato.beber();

        Dragao dragao = new Dragao("Morguetso");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Caraio");
        pombo.voar();
        pombo.enviarCarta();
        System.out.println(pombo.getCartasEnviadas());
        pombo.fazerPru();
        pombo.enviarCarta();
        System.out.println(pombo.getCartasEnviadas());
    }
        
}
