package practise.streams;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractise {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Virat", "Rohit", "virat", "Dhoni",
                "Rohit", "Gill", "dhoni"
        );
        List<String> distinctNames = names.stream().map(String::toUpperCase).distinct().toList();
        for(String s: distinctNames){
            System.out.println(s);
        }
        List<Integer> numbers =
                List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenSquares = numbers.stream().filter(m-> m % 2 == 0).map(m -> m * m).toList();
        System.out.println(evenSquares);

        Country india = new Country("India");
        Country australia = new Country("Australia");
        Country england = new Country("England");

        List<Player> players = List.of(
                new Player("Virat", india),
                new Player("Rohit", india),
                new Player("Gill", india),
                new Player("Smith", australia),
                new Player("Warner", australia),
                new Player("Root", england),
                new Player("Buttler", england)
        );
        Map<Country, List<Player>> playersByCountry
                = players.stream().collect(Collectors.groupingBy(Player::getCountry));
        playersByCountry.forEach((key, value) -> {
            System.out.println(key.getCountryName());
            System.out.println(value.stream().map(Player::getPlayerName).toList());
        });
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Virat", 95);
        marks.put("Rohit", 88);
        marks.put("Gill", 92);
        for(String key: marks.keySet()){
            System.out.println(key);
        }
        for(Integer mark: marks.values()){
            System.out.println(mark);
        }
        for(Map.Entry<String, Integer> entry: marks.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Set<String> names1 = Set.of(
                "Virat", "Rohit", "Gill", "Dhoni", "Bumrah"
        );
        List<String> updatednames1 = names1.stream().filter(name -> name.length() >= 5)
                .map(String::toUpperCase).toList();
        System.out.println(updatednames1);

        Map<String, Integer> scores = Map.of(
                "Virat", 95,
                "Rohit", 88,
                "Gill", 92,
                "Pant", 76,
                "Bumrah", 91
        );

        List<String> playerNames = scores.entrySet().stream()
                .filter(score -> score.getValue() > 90)
                .map(Map.Entry::getKey).toList();

        List<Integer> sortedScores = scores.entrySet().stream()
                .filter(score -> score.getValue() > 85)
                .map(Map.Entry::getValue)
                .sorted(Comparator.reverseOrder())
                .toList();

        Map<String, Integer> playersWithHighScores = scores.entrySet().stream()
                .filter(score -> score.getValue() > 90)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedScores);
        System.out.println(playersWithHighScores);

        String[] players1 = {
                "Virat", "Rohit", "Gill", "Dhoni", "Bumrah"
        };
        List<String> updatedPlayers1 = Arrays.stream(players1)
                .filter(name -> name.startsWith("B") || name.startsWith("D"))
                .toList();
        System.out.println(updatedPlayers1);


        int[] numbers1 = {10, 5, 20, 8, 15, 30, 3};
        int sumNumbers1 = Arrays.stream(numbers1).filter(number -> number % 2 == 0).sum();
        System.out.println(sumNumbers1);
        int maxOddNumber = Arrays.stream(numbers1).filter(number -> number % 2 != 0).max()
                .orElseThrow(() -> new RuntimeException("Not found"));
        System.out.println(maxOddNumber);


        Map<String, String> players2 = Map.of(
                "Virat", "India",
                "Rohit", "India",
                "Gill", "India",
                "Smith", "Australia",
                "Warner", "Australia",
                "Root", "England"

        );
        System.out.println(players2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting())));
        Map<String, Long> playersCountByCountry  = players2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));
        Long maxPlayersCountry = playersCountByCountry.entrySet().stream()
                .map(Map.Entry::getValue).max(Comparator.naturalOrder()).get();
        System.out.println(maxPlayersCountry);

        System.out.println(scores.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow());


        List<List<Integer>> numbers2 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );

        List<Integer> descending = numbers2.stream().flatMap(List::stream)
                .filter(num -> num % 2 == 0).sorted(Comparator.reverseOrder()).toList();
        System.out.println(descending);

        List<PlayerList> players3 = List.of(
                new PlayerList("Virat", List.of("Batting", "Fielding")),
                new PlayerList("Bumrah", List.of("Bowling", "Fielding")),
                new PlayerList("Jadeja", List.of("Batting", "Bowling", "Fielding"))
        );

        Set<String> skills = players3.stream()
                .flatMap(player3Stream -> player3Stream.getSkills().stream())
                .collect(Collectors.toSet());
        System.out.println(skills);


        List<List<String>> teams = List.of(
                List.of("India", "Australia"),
                List.of("England", "South Africa"),
                List.of("New Zealand", "Pakistan")
        );
        System.out.println(teams.stream().flatMap(List::stream).sorted().toList());
        System.out.println(players3.stream().flatMap(player3All -> player3All.getSkills().stream())
                .sorted().toList());

        Map<String, Long> playerPerSkill =
                players3.stream().flatMap(skill -> skill.getSkills().stream())
                        .collect(Collectors.groupingBy(skill -> skill, Collectors.counting()));
        System.out.println(playerPerSkill);
        System.out.println(players3.stream()
                .collect(Collectors.groupingBy(PlayerList::getName, Collectors.counting())));


        List<String> players4 = List.of(
                "Virat", "Rohit", "Gill", "Bumrah", "Dhoni"
        );
        System.out.println(players4.stream().filter(playerName -> playerName.length() > 5)
                .collect(Collectors.toList()));


        List<String> players5 = List.of(
                "Virat", "Rohit", "Virat", "Gill", "Rohit", "Bumrah"
        );
        System.out.println(players5.stream().collect(Collectors.toSet()));


        List<Players> players6 = List.of(
                new Players("Virat", 18),
                new Players("Rohit", 45),
                new Players("Bumrah", 18),
                new Players("Dhoni", 7)
        );
        System.out.println(players6.stream().collect(Collectors.toMap(Players::getName, Players::getNumber)));
        System.out.println(players6.stream()
                .collect(Collectors.toMap(Players::getNumber,
                        Players::getName,
                        (existing, replacement) -> existing)));

    }
}
