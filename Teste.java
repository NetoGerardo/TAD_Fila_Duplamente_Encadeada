
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

	public static void main(String[] args) {		
            Fila fila = new Fila();
            fila.iniciar("Primeiro");
            fila.enfileirar("Segundo");
            fila.enfileirar("Terceiro");
            fila.listarElementos();
            try {
                System.out.println("\""+fila.desenfileirar()+"\" foi removido da fila!");
            } catch (EFilaVazia ex) {
                Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
		fila.listarElementos();
	}

}