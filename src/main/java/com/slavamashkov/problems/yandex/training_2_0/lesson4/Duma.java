package com.slavamashkov.problems.yandex.training_2_0.lesson4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(.+)\\s(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Map<String, Integer> map = new HashMap<>();
        int totalVotes = 0;
        int placeRemain = 450;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            Matcher m = pattern.matcher(line);

            if (!m.matches()) {
                break;
            }

            String key = m.group(1);
            int value = Integer.parseInt(m.group(2));

            map.put(key, map.getOrDefault(key, 0) + value);

            totalVotes += value;
        }

        int votesForOnePlace = totalVotes / 450;

        map.entrySet().stream()
                .sorted(Comparator.comparing((Map.Entry<String, Integer> e) -> e.getValue()).reversed())
                .map(stringIntegerEntry -> stringIntegerEntry.getValue() / votesForOnePlace)
                .forEach(System.out::println);
    }
}
/*
parties = []
sumcnt = 0
i = 0
with open('dumaInput.txt', 'r') as fin:
    for line in fin
        words = line.split()
        cnt = int(words[-1])
        partyName = ' '.join(words[:-1])
        parties.append([partyName, cnt, i])
        sumcnt += snt
        i += 1
f = sumcnt / 450
free = 450
for i in range(len(parties)):
    party = parties[i]
    party.append(party[1] // f)
    free -= party[1] // f
    party.append(party[1] % f)
parties.sort(key=lambda x: x[4], reverse=True)
for i in range(int(free)):
    parties[i][3] += 1
parties.sort(key=lambda x: x[2])
for party in parties:
    print(party[0], int(party[3]))
*/