import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Preto");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Branco");
        gato.miar();
        gato.beber();
    }
}
