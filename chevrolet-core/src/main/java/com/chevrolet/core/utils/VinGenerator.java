package com.chevrolet.core.utils;

/**
 *  
 *  *All rights Reserved, Designed By www.maihaoche.com
 *  *@Package com.chevrolet.web.controller.vin
 *  *@author: 向阳（xiangyang@maihaoche.com）
 *  *@date: 2018/3/29下午3:34
 *  *@Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 *  *注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 *  
 */

import java.util.*;

/**
 *@Description:${TODO}(这里用一句话描述这个类的作用)
 *@author:向阳(xiangyang@maihaoche.com)
 *@date: 2018/3/29下午3:34
 *@sinceV1.0
 */
public class VinGenerator {
    private static Map<Character, Integer> kv = new HashMap<Character, Integer>();

    private static Map<Integer, Integer> wv = new HashMap<Integer, Integer>();

    static {

        for (int i = 0; i < 10; i++) {

            kv.put(String.valueOf(i).charAt(0), i);
        }

        kv.put('a', 1);
        kv.put('b', 2);
        kv.put('c', 3);
        kv.put('d', 4);
        kv.put('e', 5);
        kv.put('f', 6);
        kv.put('g', 7);
        kv.put('h', 8);
        kv.put('j', 1);
        kv.put('k', 2);
        kv.put('l', 3);
        kv.put('m', 4);
        kv.put('n', 5);
        kv.put('p', 7);
        kv.put('q', 8);
        kv.put('r', 9);
        kv.put('s', 2);
        kv.put('t', 3);
        kv.put('u', 4);
        kv.put('v', 5);
        kv.put('w', 6);
        kv.put('x', 7);
        kv.put('y', 8);
        kv.put('z', 9);


        wv.put(1, 8);
        wv.put(2, 7);
        wv.put(3, 6);
        wv.put(4, 5);
        wv.put(5, 4);
        wv.put(6, 3);
        wv.put(7, 2);
        wv.put(8, 10);
        wv.put(10, 9);
        wv.put(11, 8);
        wv.put(12, 7);
        wv.put(13, 6);
        wv.put(14, 5);
        wv.put(15, 4);
        wv.put(16, 3);
        wv.put(17, 2);

    }


    private final static String ramdomVin(String vin) {

        if (null == vin) {

            return null;

        } else if (vin.trim().length() == 17) {
            if (vin.contains("O") || vin.contains("Q") || vin.contains("I")) {
                System.out.println("mm1");
                return null;
            }


            vin = vin.trim().toLowerCase();
            char[] codes = vin.toCharArray();


            int resultInCode = 0;

            if ("0123456789x".contains(vin.subSequence(8, 9))) {

                //重点哟
                if (vin.subSequence(8, 9).toString().equals("x")) {

                    resultInCode = 10;

                } else {
                    resultInCode = Integer.valueOf(vin.subSequence(8, 9).toString());
                }

            } else {
                System.out.println("mm2");
                return null;

            }

            int total = 0;

            for (int i = 1; i < codes.length + 1; i++) {

                char code = codes[i - 1];

                if (kv.containsKey(code)) {

                    if (9 == i) {

                        continue;

                    } else {

                        total += kv.get(code) * wv.get(i);

                    }
                } else {
                    System.out.println("mm3");
                    return null;

                }
            }

            resultInCode = total % 11;
            String ramdomVin;
            if (resultInCode == 10) {
                ramdomVin = vin.substring(0, 8) + "x" + vin.substring(9, 17);
            } else {
                ramdomVin = vin.substring(0, 8) + resultInCode + vin.substring(9, 17);
            }
            return ramdomVin;
        } else {
            System.out.println("mm4");
            return null;
        }
    }


    static List<Integer> numList;

    static {
        numList = new ArrayList<Integer>();
    }

    private static String getRamdomNum() {
        int ramdom = new Random().nextInt(Integer.MAX_VALUE) % 999999;
        if (ramdom < 100000) {
            ramdom += 100000;
        }
        if (numList.contains(ramdom)) {
            return getRamdomNum();
        }
        numList.add(ramdom);
        return String.valueOf(ramdom);
    }


    /**
     * 创建车架号
     * @param seed
     * @return
     */
    public static List<String> create(String seed, int number) {
        List<String> carUniques = new LinkedList<>();
        for(int i = 0; i < number; i++){
            carUniques.add(ramdomVin(seed.substring(0, 11) + getRamdomNum()).toUpperCase());
        }
        return carUniques;
    }

}

