package pl.javastart.task;

import java.util.Arrays;
import java.util.List;

public enum Season {
    SPRING("Wiosna", "marzec", "kwiecień", "maj"),
    SUMMER("Lato", "czerwiec", "lipiec", "sierpień"),
    AUTUMN("Jesień", "wrzesień", "październik", "listopad"),
    WINTER("Zima", "grudzień", "styczeń", "luty");

    private final String translation;
    private final List<String> months;

    Season(String translation, String... months) {
        this.translation = translation;
        this.months = Arrays.asList(months);
    }

    public String getTranslation() {
        return translation;
    }

    public List<String> getMonths() {
        return months;
    }

    public static Season getSeasonFromString(String input) {
        Season result = null;
        for (Season season : values()) {
            if (season.translation.equalsIgnoreCase(input)) {
                result = season;
            }
        }
        return result;
    }
}