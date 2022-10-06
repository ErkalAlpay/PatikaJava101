public class _69harmonikSayilarArray {
    public static void main(String[] args) {
        
        double asd [] = {15, 26,35,2,6};

        //Harmonik ortalama formulü = 1/15 + 1/26 + 1/35 + 1/2 + 1/6=....

        
        harmonikOrtalamaBul(asd);
        
    }
    static public void harmonikOrtalamaBul(double asd []){
    
        double toplam =0;
        for (int i = 0; i < asd.length; i++) {
            toplam +=  1/asd[i];   
        }
        

        System.out.println("Bu dizinin harmonik ortalaması = " + toplam);

    }
}
