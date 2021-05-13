package cz.czechitas.palindrom;

public class SpousteciTrida {

    //komentované řešení: resources

    public static void main(String[] args) {

        String zkoumaneSlovo = "radar", zkoumaneSlovoOpacne = "";
        int delkaZkoumanehoSlova = zkoumaneSlovo.length();

        for (int i = (delkaZkoumanehoSlova - 1); i >= 0; --i) {
            zkoumaneSlovoOpacne = zkoumaneSlovoOpacne + zkoumaneSlovo.charAt(i);
        }
        if (zkoumaneSlovo.toLowerCase().equals(zkoumaneSlovoOpacne.toLowerCase())) {

            System.out.println("Gratuluji. Je to palindrom!");
        } else {
            System.out.println("Není to palindrom. #sorryjako");
        }

    }

}
