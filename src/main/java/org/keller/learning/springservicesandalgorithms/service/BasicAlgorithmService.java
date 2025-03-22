package org.keller.learning.springservicesandalgorithms.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicAlgorithmService {

    public int getSearchAlgorithms(String type) {

        int[] f = { 2, 4, 5, 6, 7, 8, 9, 11 };
        int k = 5;

        if(type.equals("search")){
            return search(f, k);
        }
        if(type.equals("binSearch")){
            return binSearch(f, k);
        }
        return -1;
    }

    private int binSearch(int[] array, int key) {
        int u = 0, o = array.length - 1;
        while (u <= o) {
            int m = (u + o) / 2;
            if (array[m] == key)
                return m;
            else if (array[m] > key)
                o = m - 1;
            else
                u = m + 1;
        }
        return -1;
    }

    private int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == key)
                return i;
        return -1;
    }
}
