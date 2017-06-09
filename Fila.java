
public class Fila {
	
	private No inicio = new No();
	private No fim = new No();
	private int nElementos = 0;
	
	public void iniciar(Object o){
		No novoNo = new No();
		novoNo.setElemento(o);
		inicio = novoNo;
		fim = inicio;
		nElementos++;
				
	}
	
	public int tamanho(){
		return nElementos;
	}
	
	public boolean filaVazia(){
		if(nElementos == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public Object inicio()throws EFilaVazia{
		if(filaVazia()){
			throw new EFilaVazia("Fila 321vazia!");
		}else{
			return inicio;
		}		
	}
	
	public void enfileirar(Object o){
		No novoNo = fim;
		fim = new No();
		fim.setElemento(o);
		novoNo.setProximo(fim);	
		fim.setProximo(null);
		nElementos++;
	}
	
	public Object desenfileirar() throws EFilaVazia{
                if(filaVazia()){
                    throw new EFilaVazia("Fila vazia!");
                }else{
                    No aux = inicio;
                    inicio = inicio.getProximo();
                    nElementos--;
                    return aux.getElemento();
                }
	}
	
	public void listarElementos(){
		No aux = new No();
		aux = inicio;
		System.out.println("<<<Listando>>>");
		for(int i = 0; i < nElementos; i++){
			System.out.println(i + " - "+ aux.getElemento());
			aux = aux.getProximo();
		}	
		System.out.println("<<<Fim fila>>>");
	}	
}
