package ArvoreBinaria;

public class ArvoreBinaria {

	public static void main(String[] args) {
		
		//Cria��o dos n�s
		No a = new No('a');
		No b = new No('b');
		No c = new No('c');
		No d = new No('d');
		No e = new No('e');
		No ad = new No('+');
		No sub = new No('-');
		No mult = new No('*');
		No div = new No('/');

		//Determina a posi��o de cada um em rela��o a sei n� pai, caso possua.
		//Adi��o
		ad.setEsq(a);
		ad.setDir(mult);
		//Multiplica��o
		mult.setEsq(b);
		mult.setDir(sub);
		//Subtra��o
		sub.setEsq(div);
		sub.setDir(e);
		//Divis�o
		div.setEsq(c);
		div.setDir(d);
		
		//Executa a pr�-ordem a partir de "ad" que no nosso caso � a raiz
		System.out.println("Pre-ordem");
		ad.preOrdem(ad);
		System.out.println("");
		System.out.println("");
		System.out.println("Pos-ordem");
		//Executa em p�s-ordem a partir de "ad" que no nosso caso � a raiz
		ad.posOrdem(ad);
		System.out.println("");
		System.out.println("");
		System.out.println("Ordem simetrica");
		//Executa em ordem sim�trica a partir de "ad" que no nosso caso � a raiz
		ad.simetrica(ad);		
	}
}
