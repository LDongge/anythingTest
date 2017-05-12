package com.java.base.r20170308;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/3/8.
 */
public class HashList {

    private static final int[] inputs = new int[] {
            32,
            21,
            75,
            13,
            7,
            37,
    };

    public static void main(String[] args) {
        List[] nodes = new ArrayList[6];

        for(int i = 0; i < inputs.length; ++i) {

            int index = hash(inputs[i], inputs.length);

            if(null == nodes[index]) {
                nodes[index] = new ArrayList();
            }
            Object object = null;
            nodes[index].add(new Integer(inputs[i]));
        }

        for(int i = 0; i < nodes.length; ++i) {
            List temps = nodes[i];
            if(null == temps) {
                continue;
            }
            for(int j = 0; j < temps.size(); ++j) {
                System.out.print(temps.get(j) + "   ");
            }
        }
        System.out.println();
    }

    private static int hash(int key, int length) {
        return key % length;
    }

}