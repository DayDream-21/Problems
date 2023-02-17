package com.slavamashkov.problems.yandex.training_2_0.lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        List<Set<Character>> wits = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            wits.add(new HashSet<>());
            String wit = scanner.next();
            for (int j = 0; j < wit.length(); j++) {
                wits.get(i).add(wit.charAt(j));
            }
        }

        int n = scanner.nextInt();
        List<String> nums = new ArrayList<>();
        int maxwitcnt = 0;
        for (int i = 0; i < n; i++) {
            String num = scanner.next();
            Set<Character> numset = new HashSet<>();
            for (int j = 0; j < num.length(); j++) {
                numset.add(num.charAt(j));
            }
            int witcnt = 0;
            for (Set<Character> wit : wits) {
                if (numset.containsAll(wit)) {
                    witcnt++;
                }
            }
            nums.add(num);
            maxwitcnt = Math.max(maxwitcnt, witcnt);
        }

        List<String> ans = new ArrayList<>();
        for (String num : nums) {
            Set<Character> numset = new HashSet<>();
            for (int i = 0; i < num.length(); i++) {
                numset.add(num.charAt(i));
            }
            int witcnt = 0;
            for (Set<Character> wit : wits) {
                if (numset.containsAll(wit)) {
                    witcnt++;
                }
            }
            if (witcnt == maxwitcnt) {
                ans.add(num);
            }
        }

        for (String num : ans) {
            System.out.println(num);
        }
    }
}

/*
m = int(input())
wits = []
for _ in range(m):
    wits.append(set(input().strip()))
n = int(input())
nums = []
maxwitcnt = 0
for i in range(n):
    num = input().strip()
    numset = set(num)
    #nums.append([num, 0])
    witcnt = 0
    for wit in wits:
        if wit <= numset:
            witcnt += 1
    nums.append((num, witcnt))
    maxwitcnt = max(maxwitcnt, witcnt)
ans = []
for nums in nums:
    if num[1] == maxwitcnt:
        ans.append(num[0])
print('\n'.join(ans))

 */
