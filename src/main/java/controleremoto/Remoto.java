package controleremoto;
public class Remoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //</CONSTRUTOR>
    
    public Remoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //</GETTERS AND SETTERS>
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
    
    //</MÉTODOS>
    
    //LIGAR
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    //DESLIGAR
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    //ABRIR MENU
    @Override
    public void abrirMenu(){
        System.out.println("--------- MENU ----------");
        System.out.println("Está ligado? | " + this.getLigado() + " |");
        System.out.println("Está tocando? | " + this.getTocando() + " |");
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }
    
    //FECHAR MENU
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu. . . ");
    }
    
    //MAIS VOLUME
    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        }
    }
    
    // MENOS VOLUME
    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 10);
        }
    }
    
    //LIGAR MUDO
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    //DESLIGAR MUDO
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    //PLAY
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    
    //PAUSE
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
            
}
