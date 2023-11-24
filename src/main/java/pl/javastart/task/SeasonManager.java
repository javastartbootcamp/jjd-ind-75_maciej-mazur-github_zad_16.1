package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        printSeasons();
        printChosenSeason(scanner.nextLine());
    }

    private void printSeasons() {
        System.out.println("Podaj porę roku:");
        for (Season season : Season.values()) {
            System.out.println(season.getTranslation());
        }
    }

    private void printChosenSeason(String input) {
        Season chosenSeason = Season.getSeasonFromString(input);
        if (chosenSeason == null) {
            System.out.println("Nie ma takiej pory roku jak " + input);
        } else {
            System.out.println(chosenSeason.getMonths());
        }
    }
}
