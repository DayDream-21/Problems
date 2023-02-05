package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Trie trie = new Trie();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            trie.insert(x);
            System.out.println(trie.findMaxXOR(x));
        }
    }
}

class TrieNode {
    int value;
    TrieNode[] children;

    TrieNode() {
        value = 0;
        children = new TrieNode[2];
    }
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(int x) {
        TrieNode curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (x >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new TrieNode();
            }
            curr = curr.children[bit];
        }
        curr.value = x;
    }

    int findMaxXOR(int x) {
        TrieNode curr = root;
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (x >> i) & 1;
            if (curr.children[bit ^ 1] != null) {
                result |= (1 << i);
                curr = curr.children[bit ^ 1];
            } else {
                curr = curr.children[bit];
            }
        }
        return result;
    }
}
