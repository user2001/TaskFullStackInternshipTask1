package Task2;

import java.util.*;
import java.util.stream.Collectors;

public class HashTagMain {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "#Iva live #norm life It's #norm",
                "#Iva knows #many #books #Many", " #Iva #Books are #really #great",
                "#Many words #great and #books", "#great", "#great", "#great", "#Iva", "#want to know",
                "#Books", "#norm", "#life", "#norm", "#life", "#norm", "#life", "#norm", "#life");
        toFind5MostPopularWords(stringList);
    }

    /**
     * Method takes List of Strings and return collection of top 5 most popular words(and their frequency)
     * witch starts with hashtag sign. If one string has few the same words with hashtag, it counts like one
     *
     * @param stringList
     * @return
     */
    public static Map<String, Long> toFind5MostPopularWords(List<String> stringList) {

        List<List<String>> distinctList = new ArrayList<>();

        for (String s : stringList) {
            String[] arr = s.split(" ");
            List<String> listTry = new ArrayList<>();
            for (String value : arr) {
                if (value.startsWith("#")) {
                    listTry.add(value.toLowerCase());
                }
            }
            listTry = listTry.stream().distinct().collect(Collectors.toList());
            distinctList.add(listTry);
        }
        //collect all list to one
        List<String> finishList = distinctList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        //grouping words by count
        Map<String, Long> map = finishList.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));


        Map<String, Long> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
        return result;
    }
}


