package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class DebugDemo {


    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("zhangsan");
        list.add("list");
        list.add("wangwu");

        String result = getResult(list);
        System.out.println(result);


    }

    private static String getResult(List<String> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder("");
        for (String s : list) {
            sb.append(s).append(" ");
        }

        return sb.toString();


    }

}
