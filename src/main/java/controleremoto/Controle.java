package controleremoto;
public class Controle {
    public static void main(String[] args) {
        Remoto c = new Remoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.abrirMenu();
    }
}
