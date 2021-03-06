package ArvoreBinaria;

public class No {
	
	//Atributos de um n�
	public No esq;
	public No dir;
	public char valor;
	
	//Construtor sem par�metros
	public No(){
		this.esq = null;
		this.dir = null;
		this.valor = 0;
	}
	
	//Construtor com o par�metro valor que � utilizado para a cria��o de um n�
	public No(char valor){
		this.valor = valor;
	}
	
	//Define um n� como esquerdo de outro
	public void setEsq(No no){
		this.esq = no;
	}
	
	//Define um n� como direito de outro
	public void setDir(No no){
		this.dir = no;
	}
	
	//Retorna o valor de um n�
	public char getValor(){
		return this.valor;
	}
	
	//Retorna o n� esquerdo de outro
	public No getEsq(){
		return this.esq;
	}
	
	//Retorna o n� direito de outro
	public No getDir(){
		return this.dir;
	}
	
	public void preOrdem(No no){
		if(no != null){
			System.out.print(no.getValor());
			preOrdem(no.getEsq());			
			preOrdem(no.getDir());
		}
	}
	
	public void simetrica(No no){
		if(no != null){
			simetrica(no.getEsq());
			System.out.print(no.getValor());
			simetrica(no.getDir());
		}
	}
	
	public void posOrdem(No no){
		if(no != null){
			
			posOrdem(no.getEsq());			
			posOrdem(no.getDir());
			System.out.print(no.getValor());
		}
	}
}
