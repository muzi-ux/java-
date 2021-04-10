package com.Dome01.Landiord;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {
        // 生成扑克牌
        ArrayList<String> hearts = new ArrayList<>(); // 红桃    玩家1
        ArrayList<String> spades = new ArrayList<>(); // 黑桃     玩家2
        ArrayList<String> squarePiece = new ArrayList<>(); // 方片    玩家3
        ArrayList<String> plumBlossom = new ArrayList<>(); // 梅花    底牌

        ArrayList<String> all = new ArrayList<>();

        hearts = color(add(hearts), "♥");
        spades = color(add(spades), "♠");
        squarePiece = color(add(squarePiece), "♦");
        plumBlossom = color(add(plumBlossom), "♣");

        all = merge(all, hearts);
        all = merge(all, spades);
        all = merge(all, squarePiece);
        all = merge(all, plumBlossom);
        all.add("大王");
        all.add("小王");

        shuffle(all);

//        ArrayList<String> player1 = new ArrayList<>(); // 玩家1
//        ArrayList<String> player2 = new ArrayList<>(); // 玩家2
//        ArrayList<String> player3 = new ArrayList<>(); // 玩家3
//        ArrayList<String> HoleCards = new ArrayList<>(); //底牌

        hearts.clear();
        spades.clear();
        squarePiece.clear();
        plumBlossom.clear();
        for (int i = 0; i < all.size(); i++) {
            int index = i % 3;
            if (i < 51) {
                if (index == 0) {
                    hearts.add(all.get(i));
                } else if (index == 1) {
                    spades.add(all.get(i));
                } else if (index == 2) {
                    squarePiece.add(all.get(i));
                }
            } else {
                plumBlossom.add(all.get(i));
            }

        }

        System.out.println(hearts);
        System.out.println(spades);
        System.out.println(squarePiece);
        System.out.println(plumBlossom);
    }

    public static ArrayList<String> add(ArrayList<String> list) {
        for (int i = 2; i <= 10; i++) {
            list.add(i + "");
        }
        list.add("A");
        list.add("J");
        list.add("Q");
        list.add("K");

        return list;
    }

    public static ArrayList<String> color(ArrayList<String> list, String flower) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            String combination = list.get(i) + flower;
            arr.add(combination);
        }

        return arr;
    }

    public static ArrayList<String> merge(ArrayList<String> list, ArrayList<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        return list;
    }

}


