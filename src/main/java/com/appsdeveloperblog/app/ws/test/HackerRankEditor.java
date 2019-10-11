package com.appsdeveloperblog.app.ws.test;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class HackerRankEditor {

    public static void main(String[] args) {
      List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Long a = 0L;

        for (int i = 0; i < size; i++) {
            result.add(sc.nextInt());
            a+=result.get(i);
        }
        System.out.println(a);

    }
}
