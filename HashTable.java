package com.java.base.r20170308;

/**
 * Created by pengfei on 2017/3/8.
 */
public class HashTable {

    private static final int[] inputs = new int[] {
            32,
            21,
            75,
            13,
            7,
            37,
    };

    public static void main(String[] args) {
        int[] datas = new int[6];

        for(int i = 0; i < inputs.length; ++i) {
            int index = hash(inputs[i], inputs.length);

            datas[getIndex(datas, index)] = inputs[i];
        }

        for(int i = 0; i < datas.length; ++i) {
            System.out.print(datas[i] + " ");
        }
        System.out.println();
    }

    private static int getIndex(int[] datas, int index) {
        int temp = datas[index];
        while(0 != temp) {
            index = hash(index + 1, inputs.length);
            temp = datas[index];
        }
        return index;
    }

    private static int hash(int key, int length) {
        return key % length;
    }

}
