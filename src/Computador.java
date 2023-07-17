public class Computador {
    //public publico
    //private privado
    //protected protegido


    private int carga = 0;
    private int maxCarga;
    protected boolean ligar;

   
    private void ligarComputador (){ 
        this.ligar = true;
        System.out.println("Computador ligando");
    }
    private void desligarComputador (){ 
        this.ligar = false;
        System.out.println("Computador desligando!, Conecte o carregador");
    }


    public Computador (int maxCarga){
        this.maxCarga = maxCarga;
    }
    
    public int getCarga(){ 
        return this.carga;
    }
    public void Carregando(){
        if(this.carga + 1 <= maxCarga ){
        this.carga++;
        }else{
            System.out.println("Completamente carregado\n");
            this.ligarComputador();
        }

    }
    public void descarregando(){
        if(this.carga + 1 >= maxCarga ){
            this.carga--;
        }
        else{
            System.out.println("Sem bateria conectar o carregador\n");
            this.desligarComputador();
        }
    }
}
    
