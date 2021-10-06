Algoritmo sin_titulo
	Escribir 'Resolveremos ax+b=c'
	Escribir 'Introduce el coeficiente de la x, a'
	Leer a
	Si a=0 Entonces
		Escribir "No se puede realizar la operacion"
	SiNo
		Escribir 'Introduce b'
		Leer b
		Escribir 'Introduce c'
		Leer c
		x <- (c-b)/a
		Escribir 'X es igual a: ',x
	FinSi
FinAlgoritmo
