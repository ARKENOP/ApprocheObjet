package utils;

public class ConversionNombre {
    public static void main(String[] args) {

        String chaine = "42";

        int nombre = Integer.parseInt(chaine);
        System.out.println("Le nombre est : " + nombre);

        int a = 10;
        int b = 20;

        int max = Math.max(a, b);
        System.out.println("Le plus grand nombre est : " + max);
    }
}
