package FUNCIONES;

public class UtilesParaNumeros {
    

    static boolean esCapicua(int numero)
    {
        boolean resultado = false;
        // FUNCION VOLTEA:
        long volteado = voltea(numero);

        // COMPARAMOS:
        if (numero == volteado)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    static long voltea(long numero)
    {
        long resto = 0;
        long volteado = 0;
        long numOperativo = numero;
        while (numOperativo > 0)
        {
            resto = numOperativo % 10;
            volteado = (volteado*10)+resto;
            numOperativo = numOperativo/10;
        }
        return volteado;
    }

    public static boolean esPrimo(int numero)
    {
        boolean resultado = true;
        int contador = 0;
        int divisor = 2;
        while(contador<1 && divisor<numero)
        {
            if (numero%divisor==0)
            {
                contador++;
                resultado = false;
            }
            divisor++;
        }
        return resultado;
    } 

    public static int siguientePrimo(int numero)
    {
        int resultado = numero+1;
        while (esPrimo(resultado)==false)
        {
            resultado++;
        }
        return resultado;
    }

    static long potencia(long base, long exponente)
    {
        long resultado = 1;

        if (exponente > 0)
        {
            for (int aux=1; aux<=exponente; aux++)
            {
                resultado = resultado * base;
            }
        }

        return resultado;
    }

    static long digitos(long numero)
    {
        int contadorDigitos = 0;
        while (numero > 0)
        {
            numero = numero/10;
            contadorDigitos++;
        }
        return contadorDigitos;
    }

    static long digitoN(long numero, int posicion)
    {
        long resto = 0;
        long numeroAlReves = UtilesParaNumeros.voltea(numero);

        for (int aux = 0; aux<=posicion; aux++)
        {
            resto = numeroAlReves % 10;
            numeroAlReves = numeroAlReves/10;
        }
        return resto;
    }

    static long posicionDeDigito(long numero, int digito)
    {
        int contadorPosicion = 0;
        long volteado = UtilesParaNumeros.voltea(numero);

        while (volteado%10!=digito && volteado>0)
        {
            volteado = volteado/10;
            contadorPosicion++;
        }
        if (volteado == 0)
        {
            contadorPosicion = -1;
        }
        return contadorPosicion;
    }

    static long quitaPorDetras(long numero, long digitos)
    {
        return numero = numero/UtilesParaNumeros.potencia(10, digitos);
    }

    static long quitaPorDelante(long numero, long digitos)
    {
        long volteado = UtilesParaNumeros.voltea(numero);

        volteado = volteado/UtilesParaNumeros.potencia(10, digitos);

        long resultado = UtilesParaNumeros.voltea(volteado);

        return resultado;
    }

    static long pegaPorDetras(long numInicial, long numPegado)
    {
        long digitosNumPegado = UtilesParaNumeros.digitos(numPegado);

        numInicial = numInicial*UtilesParaNumeros.potencia(10, digitosNumPegado);

        return numInicial = numInicial + numPegado;
    }

    static long pegaPorDelante(long numInicial, long numPegado)
    {
        long numReves = UtilesParaNumeros.voltea(numInicial);

        long numNuevo = UtilesParaNumeros.pegaPorDetras(numReves, numPegado);

        long numFinal = UtilesParaNumeros.voltea(numNuevo);

        return numFinal;
    }

    static long trozoDeNumero(long numero, int pos1, int pos2)
    {
        long nuevoNumero = UtilesParaNumeros.quitaPorDetras(numero, (digitos(numero)-pos2)-1);

        long trozoNum = UtilesParaNumeros.quitaPorDelante(nuevoNumero, pos1);

        return trozoNum;
    }

    static String convierteEnPalotes(int numero)
    {
        String resultado = "";

        long numeroDigitos = digitos(numero);

        for(int aux=0; aux < numeroDigitos; aux++)
        {
            long digito = digitoN(numero, aux);
            for(int i=1; )

        }


        int resto = n%10;



        return resultado;
    }



}
