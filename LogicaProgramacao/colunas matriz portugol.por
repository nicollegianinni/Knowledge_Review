programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO =3
		inteiro matriz [TAMANHO][2],l,c
		

		para (l=0;l<TAMANHO;l++)
		{
			para (c=0;c<2;c++)
			{
				escreva("digite um numero")
				leia (matriz[l][c])
			}
		}
		limpa()
		
		para (l=0;l<TAMANHO;l++)
		{
			para (c=0;c<2;c++)
			{
				escreva("\t [ " , matriz [l][c] , " ]")
				
			}
			escreva ("\n ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */