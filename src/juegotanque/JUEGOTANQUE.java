
package juegotanque;

public class JUEGOTANQUE {

   
    public static void main(String[] args) {
        int ancho=30;
        int altura=30;
        char caracter=' ';
        int tanque1x=13;
        int tanque1y=28;
        int tanque2x=12;
        int tanque2y=29;
        int tanque3x=13;
        int tanque3y=29;
        int tanque4x=14;
        int tanque4y=29;
        int tanqueBalaX=13;
        int tanqueBalaY=25;
        char caracTanque='*';
        String caracTanqueBala="|";
        int enemigo1x=2;
        int enemigo1y=13;
        int enemigo2x=2;
        int enemigo2y=14;
        int enemigo3x=3;
        int enemigo3y=13;
        int enemigo4x=3;
        int enemigo4y=14;
        int enemigo5x=2;
        int enemigo5y=12;
        int enemigo6x=3;
        int enemigo6y=12;
        int enemigo7x=2;
        int enemigo7y=15;
        int enemigo8x=3;
        int enemigo8y=15;
        
        
       
        
        
        int residuo1x=21;
        int residuo1y=10;
        int residuo2x=20;
        int residuo2y=16;
        int residuo3x=22;
        int residuo3y=18;
        int residuo4x=19;
        int residuo4y=8;
        int residuo5x=7;
        int residuo5y=10;
        int residuo6x=7;
        int residuo6y=12;
        int residuo7x=7;
        int residuo7y=20;
        int residuo8x=7;
        int residuo8y=14;
        
        
        while(true){
            limPantalla();
            tanqueBalaY--;
        for(int i=0; i<altura; i++)
        {
            for(int j=0; j<ancho; j++)
            {
                
                if(j==tanque1x && i==tanque1y){System.out.print(caracTanque+" ");
                }else if(j==tanque2x && i==tanque2y){System.out.print(caracTanque+" ");
                }else if(j==tanque3x && i==tanque3y){System.out.print(caracTanque+" ");
                }else if(j==tanque4x && i==tanque4y){System.out.print(caracTanque+" ");
                }else if(j==tanqueBalaX && i==tanqueBalaY){System.out.print(caracTanqueBala+" ");
                }else if(j==enemigo1y && i==enemigo1x){System.out.print(caracTanque+" ");
                }else if(j==enemigo2y && i==enemigo2x){System.out.print(caracTanque+" ");
                }else if(j==enemigo3y && i==enemigo3x){System.out.print(caracTanque+" ");
                }else if(j==enemigo4y && i==enemigo4x){System.out.print(caracTanque+" ");
                }else if(j==enemigo5y && i==enemigo5x){System.out.print(caracTanque+" ");
                }else if(j==enemigo6y && i==enemigo6x){System.out.print(caracTanque+" ");
                }else if(j==enemigo7y && i==enemigo7x){System.out.print(caracTanque+" ");
                }else if(j==enemigo8y && i==enemigo8x){System.out.print(caracTanque+" ");
                
                }else {System.out.print(caracter+" ");}
                if((tanqueBalaX & tanqueBalaY)==(enemigo1x & enemigo1y) )
                {
                    enemigo1x=residuo1y;
                    enemigo1y=residuo1x;
                    enemigo2x=residuo2y;
                    enemigo2y=residuo2x;    
                    enemigo3x=residuo3y;
                    enemigo3y=residuo3x;
                    enemigo4x=residuo4y;
                    enemigo4y=residuo4x;
                    enemigo5x=residuo5y;
                    enemigo5y=residuo5x;
                    enemigo6x=residuo6y;
                    enemigo6y=residuo6x;
                    enemigo7x=residuo7y;
                    enemigo7y=residuo7x;
                    enemigo8x=residuo8y;
                    enemigo8y=residuo8x;   
                        
                    for(int m=0; m<altura; m++)
                    {
                        for(int n=0; n<ancho; n++)
                        {
                            if((m==enemigo1x && n==enemigo1y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo2x && n==enemigo2y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo3x && n==enemigo3y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo4x && n==enemigo4y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo5x && n==enemigo5y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo6x && n==enemigo6y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo7x && n==enemigo7y)){
                                System.out.print(caracTanque+" ");
                            }else if((m==enemigo8x && n==enemigo8y)){
                                System.out.print(caracTanque+" ");
                            }
                            
                        }
                    }
                }
            }
            System.out.print("\n");
        }
            espera();
        }
    }
    public static void espera()
    {
        try{
            Thread.sleep(1000);
        }catch(Exception s){}
    }
    public static void limPantalla()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception ex) {
        }
        System.out.flush();
    }
}
