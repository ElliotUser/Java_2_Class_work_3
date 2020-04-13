package ru.rickSanchez.company.home_work_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Мойша Мойша песни пел королева слушала Мойша пел ей про любовь та " +
                "клубнику кушала Мойша Мойша песню спел что охранник побледнел Мойша спел" +
                " Степан в горах королеву трах";

        String[] arrWords = text.split(" ");
        Set<String> listWords = new HashSet<>(arrWords.length);
        Collections.addAll(listWords,arrWords);

        for(String words : listWords) {
            System.out.print(words + " ");
        }


        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : arrWords){
            Integer frequency = hashMap.get(s);
            hashMap.put(s, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);
//--------------------------------------------------------------------------------------------------




    }
}
