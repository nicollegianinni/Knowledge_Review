programa
{
	
	funcao inicio()
	{
		inteiro numero, numtab, resultado

		escreva("digite o valor da tabuada:")
		leia (numtab)
		limpa()

		para (numero=0; numero<=10;numero++)
		{
			resultado = numero * numtab
			escreva("\n ",numtab, " x " , numero, " = " , resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */