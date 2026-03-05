import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    private static Random random = new Random();

    public static String generatePassword(
            List<String> words,
            List<String> numbers,
            List<String> symbols,
            boolean capitalizeRandomWord) {

        // Välj två slumpmässiga ord
        String word1 = words.get(random.nextInt(words.size()));
        String word2 = words.get(random.nextInt(words.size()));

        // Eventuell versal första bokstav
        if (capitalizeRandomWord) {
            word1 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
        }

        // Välj slumpmässigt nummer och symbol
        String number = numbers.get(random.nextInt(numbers.size()));
//        String symbol = symbols.get(random.nextInt(symbols.size()));

        // Bygg lösenord
        return word1 + word2 + number ;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Ander", "Anders", "Jan", "Peter", "Persson",
                "Anna", "Erik", "Ebba",
                "Ina", "Freddan",
                "Stenstigen", "Horby",
                "Volvo", "XC90",
                "MFF",
                "IPA", "Lager", "Stout", "Nordic", "Nordic Trailworks AB", "Trailworks", "Lösenord",
                "Password", "lösenord", "password", "familjen", "familj"
        );

        List<String> numbers = Arrays.asList(
                "45",
                "42",
                "14",
                "12",
                "7",
                "1",
                "90",
                "1910",
                "12",
                "123"
        );

//        List<String> symbols = Arrays.asList(
////                "!", "@", "#", "_"
//        );

        // Generera 10 exempel
        for (int i = 0; i < 5000; i++) {
            System.out.println(generatePassword(words, numbers, null, true));
        }
    }
}
