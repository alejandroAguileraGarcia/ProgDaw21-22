Algoritmo sin_titulo
	Escribir 'Introduce el precio inicial'
	Leer precio
	Escribir 'Hay tres tipos de ivas: 1-Normal 2-Reducido 3-Super reducido. Introduzca el numero de IVA que desea'
	Leer nIva
	Segun nIva  Hacer
		1:
			precio <- precio*1.21
		2:
			precio <- precio*1.10
		3:
			precio <- precio*1.04
		De Otro Modo:
			Escribir 'Numero de iva no valido'
	FinSegun
	Escribir 'El precio final es ',precio
FinAlgoritmo
