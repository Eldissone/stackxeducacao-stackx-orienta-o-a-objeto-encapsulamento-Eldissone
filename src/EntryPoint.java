//Importe sua classe aqui

class EntryPoint {
    public static void main(String[] args) {
        //Instancie sua classe aqui  
        Computador computador = new Computador(100);
        for(int i = 0; i <= 100; i++)
         computador.Carregando();

        // teste de descarregamento do computador
        // for(int i = 0; i <= 2; i++)
        //  computador.descarregando();

    }
}