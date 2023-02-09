programa
{
	
	funcao inicio()
	{
		inteiro numero [4], x  // 4 posições, unidimensional, posição inicial é zero (0,1,2,3)

		para (x=0;x<4;x++)
		{
			escreva("\n Digite um numero para formar as 4 posições do vetor:")
			leia(numero[x]) // colocando vazio ou x, entende que é para preencher a posição inicial. 
			               //se colocar algum numero dentro quer dizer que quer preencher a posição escrita.
		}
		escreva ("\n")
		
		para (x=0;x<4;x++)
		{
			escreva("\nvalor da posição" ,x+1, ":", numero[x])
		}
		
		escreva ("\n")
		
		para (x=3;x>=0;x--)
		{
			escreva("\nvalor da posição" ,x+1, ":", numero[x])
			
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */