/*numeros[i] = i++ % 2 == 0 ? menores[contMen--] : mayores[contMay--];

int i = 0;

    while (contMen >= 0 && contMay >= 0){
      
      if (i % 2 == 0) {
        numeros[i++] = menores[contMen];
        contMen--;
      }else {
        numeros[i] =  mayores[contMay];
        contMay--;
      }
      

    }
    

    if (contMen > 0) numeros [i++] = menores[contMen--] ;
    else if (contMay > 0) numeros [i++] = mayores[contMay--] ;*/