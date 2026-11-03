package frioMijas_Hector.Personal;

class Password {
    

    // ATRIBUTOS:
    private int longitud;
    private String contraseña;


    // CONSTRUCTORES:   "Como no es visible no necesito constructor"

    public Password()
    {
        this.longitud = 8;
        generaPassword();
    }

    public Password(int longitud)
    {
        this.longitud = longitud;
        generaPassword(longitud);
    }


    // METODOS:
    public void generaPassword()
    {
        int longitud = this.getLongitud();

        this.contraseña = "";

        for (int i = 0; i < longitud; i++)
        {
            int tipo = (int)(Math.random()*3+1);

            switch(tipo)
            {
                case 1:
                    this.contraseña += addCapital();
                    break;
                
                case 2:
                    this.contraseña += addNumber();
                    break;

                case 3:
                    this.contraseña += addLower();
                    break;
                default:
            }
        }
    }

    private String addCapital()
    {
        int upperValue = (int)(Math.random()*(90-65+1)+65);

        String add = Character.toString(upperValue);

        return add;
    }

    private String addLower()
    {
        String add = addCapital().toLowerCase();

        return add;
    }

    private String addNumber()
    {
        String add = "" + (int)(Math.random()*10);

        return add;
    }

    public boolean esFuerte()
    {
        int capitalCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        boolean fuerte = false;

        longitud = this.contraseña.length();

        for (int i = 0; i < longitud-1; i++)
        {
            int valorAscii = Integer.valueOf(this.contraseña.charAt(i));


            if((valorAscii>=48)&&(valorAscii<=57))
            {
                numberCount++;
            }
            else if((valorAscii>=65)&&(valorAscii<=90))
            {
                capitalCount++;
            }
            else if((valorAscii>=97)&&(valorAscii<=122))
            {
                lowerCount++;
            }
        }

        if(numberCount>=5 && capitalCount >= 2 && lowerCount >= 1)
        {
            fuerte = true;
        }
        
        return fuerte;
    }

    public void generaPassword(int longitud)
    {
        setLongitud(longitud);

        generaPassword();
    }

    private int getLongitud()
    {
        return this.longitud;
    }

    private void setLongitud(int longitud)
    {
        this.longitud = longitud;
    }

    public String getContraseña()
    {
        return this.contraseña;
    }

}
