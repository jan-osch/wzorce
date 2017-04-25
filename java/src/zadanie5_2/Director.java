package zadanie5_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Director {
    private final Builder builder;
    private static final Pattern meatPattern = Pattern.compile("meat (.+)");
    private static final Pattern saucePattern = Pattern.compile("sauce (.+)");

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String path) throws IOException {
        List<String> list = this.parseFile(path);

        list.forEach((element) -> {
            Matcher sauceMatcher = Director.saucePattern.matcher(element);
            Matcher meatMatcher = Director.meatPattern.matcher(element);

            if (meatMatcher.find()) {
                int amount = Integer.valueOf(meatMatcher.group(1));
                this.builder.buildMeat(amount);
            } else if (sauceMatcher.find()) {
                String sauceType = sauceMatcher.group(1);
                this.builder.buildSauce(sauceType);
            } else if (Pattern.matches("bread", element)) {
                this.builder.buildBread();
            } else if (Pattern.matches("salad", element)) {
                this.builder.buildSalad();
            } else if (Pattern.matches("cheese", element)) {
                this.builder.buildCheese();
            } else {
                throw new IllegalStateException("Recipe element not recognised");
            }
        });

    }

    private List<String> parseFile(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .collect(Collectors.toList());
    }
}
