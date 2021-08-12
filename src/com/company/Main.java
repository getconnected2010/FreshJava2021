package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, Integer> data= new HashMap<Integer, Integer>();
        ArrayList<Integer> hashArr = new ArrayList<Integer>();
        Random rand = new Random();


        int x = rand.nextInt(10000);
        System.out.println(x);

        int y = rand.nextInt(10000);
        System.out.println(y);

        hashArr.add(data.put(x, y));
        System.out.println(hashArr.get(0));


    }
}
