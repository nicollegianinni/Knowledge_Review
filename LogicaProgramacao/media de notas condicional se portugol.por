programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

	cadeia nome
	real n1,n2,n3, media

	escreva ("\n escreva seu nome:")
	leia (nome)
	escreva ("\n sua 1 nota:")
	leia (n1)
	escreva ("\n sua 2 nota:")
	leia (n2)
	escreva ("\n sua 3 nota:")
	leia (n3)


	media = (n1+n2+n3)/3
	limpa()
	
	se (media >=7.0)
	{
	  escreva ("\nAluno(a):" , nome , "\nParabens você esta aprovado ! Sua nota foi: ", mat.arredondar(media,2))
	}
	senao se (media>=4 e media<7)
	{
		escreva ("\nAluno(a): ", nome, "\nSua nota foi: " , mat.arredondar(media,2) , "você terá que recuperar a nota!" )
	}
	senao 
	{
		escreva ("\nAluno(a): ", nome, "\nSua nota foi muito abaixo da media: " , mat.arredondar(media,2) , "Infelismente você está reprovado!" )
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */