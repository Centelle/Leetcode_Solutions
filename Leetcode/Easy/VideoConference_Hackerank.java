package Leetcode.Easy;

import java.util.*;

public class VideoConference_Hackerank {
    /**
     * Bob is making a video conference software. Whenever a new person joins the conference, Bob displays
     * the person's name in the interface.
     * But displaying full name is boring and takes a lots of space. So he decided to display the shortest prefix
     * which doesn't match with any prefix of any person who have joined earlier.
     * Let's suppose the first person to enter the conference is alvin .
     * Now suppose next person to join is alice . The shortest prefix of alice that doesn't match with any prefix
     * of alvin is ali .
     * If the full name of the a new person matches completely with any person who have joined earlier, he will
     * display the full name and add a suffix which indicates how many times the same name occurs in the list
     * so far. For example if another person name alvin joins, the list will look like this:
     * You are given the list of the person who have joined the call in chronological order. Your task is to figure
     * out how the final list will look like.
     */

    public List<String> arrange_original(List<String> names) {
        List<String> prefixes_ans = new ArrayList<>();
        HashSet<String> subsets = new HashSet<>();
        HashMap<String, Integer> uniqueNames_count = new HashMap<>();
        // subsets stored to prevent repetition of strings
        int number = 2;
        for (String name : names) {
            boolean inserted = false;
            if (uniqueNames_count.containsKey(name)) {
                int keyCount = uniqueNames_count.get(name);
                uniqueNames_count.put(name, keyCount + 1);
                prefixes_ans.add(name + " " + (keyCount + 1));
                inserted = true;
            } else {
                uniqueNames_count.put(name, 1);
            }

            for (int i = 0; i < name.length(); i++) {
                String temp = name.substring(0, i + 1);
                if (!inserted && !subsets.contains(temp)) {
                    prefixes_ans.add(temp);
                    inserted = true;
                }
                subsets.add(temp);
            }

        }
        return prefixes_ans;
    }

    public List<String> solve_moreCorrect(List<String> names) {
        Map<String, Integer> data = new HashMap<>();

        List<String> result = new ArrayList<>();
        for (String name : names) {

            boolean isPrefixFound = false;
            for (int i = 1; i < name.length(); i++) {
                String prefix = name.substring(0, i);

                if (!isPrefixFound && !data.containsKey(prefix)) {
                    isPrefixFound = true;
                    result.add(prefix);
                }

                if (!data.containsKey(prefix)) {
                    data.put(prefix, 0);
                }
            }

            int occures = data.getOrDefault(name, 0);
            if (!isPrefixFound) {
                String proccessed = (occures == 0) ? name : name + " " + (occures + 1);
                result.add(proccessed);
            }
            data.put(name, occures + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("marry");
        names.add("marry");
        names.add("marry");
        names.add("marassdasadasdary");
        names.add("asad");

        VideoConference_Hackerank ob = new VideoConference_Hackerank();
        System.out.println("ob.arrange_orignal(names)   = " + ob.arrange_original(names));
        System.out.println("ob.solve_moreCorrect(names) = " + ob.solve_moreCorrect(names));
        int[] ans = {1, 2, 4, 6};
        int[]  re = Arrays.copyOf(ans, ans.length);
    }
}
