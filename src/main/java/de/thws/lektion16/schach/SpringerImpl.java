package de.thws.lektion16.schach;

public class SpringerImpl extends AbstractFigur implements Springer{
    public SpringerImpl(int x, int y){
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        Brett brett = new Brett();
        int nx = this.getX();
        int ny = this.getY();
        brett.markiereFeld(nx, ny);

        if(x-1>=1 && y-2>=1){
            brett.markiereFeld(x-1, y-2);
        }
        if(x-1>=1 && y+2<=8){
            brett.markiereFeld(x-1, y+2);
        }
        if(x-1>=1 && y-2>=1){
            brett.markiereFeld(x-1, y-2);
        }
        if(x+1<=8 && y-2>=1){
            brett.markiereFeld(x+1, y-2);
        }
        if(x+1<=8 && y+2<=8){
            brett.markiereFeld(x+1, y+2);
        }
        if(x-2>=1 && y-1>=1){
            brett.markiereFeld(x-2, y-1);
        }
        if(x-2>=1 && y+1<=8){
            brett.markiereFeld(x-2, y+1);
        }
        if(y+2<=8 && y-1>=1){
            brett.markiereFeld(x+2, y-1);
        }
        if(y+2<=8 && y+1<=8){
            brett.markiereFeld(x+2, y+1);
        }
        return brett;
    }

    public static void main(String[] args)
    {
        SpringerImpl s = new SpringerImpl(4,5);
        Brett brett = s.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
