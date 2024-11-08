package de.thws.lektion16.schach;

public class  LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    //TODO: Erg�nzen Sie den Algorithmus zur Bestimmung der Felder
    int nx = this.getX();
    int ny = this.getY();
    brett.markiereFeld(nx, ny);

    for(int i = nx + 1, j = ny + 1; i <= 8 && j <= 8; i++, j++){
      brett.markiereFeld(i, j);
    }
    for(int i = nx - 1, j = ny - 1; i >= 1 && j >= 1; i--, j--){
      brett.markiereFeld(i, j);
    }
    for(int i = nx + 1, j = ny - 1; i <= 8 && j >= 1; i++, j--){
      brett.markiereFeld(i, j);
    }
    for(int i = nx - 1, j = ny + 1; i >= 1 && j <= 8; i--, j++){
      brett.markiereFeld(i, j);
    }

    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
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
