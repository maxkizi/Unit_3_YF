package arrayz;

public class Arrayz3 {
    public static void main(String[] args) {
        String [] gf = new String[20];
        gf[0] = "Masha";
        gf[1] = "Natasha";
        gf[2] = "Sveta";
        gf[3] = "Dasha";
        gf[19] = "Olya";

        for (String girl: gf){
            if (girl == null)
                continue;
            System.out.println("I love you " + girl);
        }
    }
}
