package de.thws.lektion16.muenzautomat;

public class MinimaleChangeCalculator implements ChangeCalculator{

    @Override
    public int[] getChange(int euros, int cent) {
        int zweiEuro = euros / (Coin.EURO_2.value / 100);
        int einEuro = euros % (Coin.EURO_2.value / 100);

        int fuenfzig = cent / Coin.CENT_50.value;
        int zwanzig = (cent % Coin.CENT_50.value) / Coin.CENT_20.value;
        int zehn = ((cent % Coin.CENT_50.value) % Coin.CENT_20.value) / Coin.CENT_10.value;
        int fuenf = (((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) / Coin.CENT_5.value;
        int zwei = ((((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) % Coin.CENT_5.value) / Coin.CENT_2.value;
        int eins = (((((cent % Coin.CENT_50.value) % Coin.CENT_20.value) % Coin.CENT_10.value) % Coin.CENT_5.value) % Coin.CENT_2.value) / Coin.CENT_1.value;

        return new int[] {
                eins,
                zwei,
                fuenf,
                zehn,
                zwanzig,
                fuenfzig,
                einEuro,
                zweiEuro
        };
    }


    public static void main(String[] args){
        MinimaleChangeCalculator mcc = new MinimaleChangeCalculator();
        int[] finale = mcc.getChange(13, 89);
        Coin[] coins = Coin.values();
        for(int i = 0; i < finale.length; i++){
            System.out.println("For " + coins[i] + ": " + finale[i]);
        }
    }
}
