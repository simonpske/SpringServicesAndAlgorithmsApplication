package org.keller.learning.springservicesandalgorithms.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicAlgorithmService {

    public int getSearchAlgorithms() {
        int[] f = { 2, 4, 5, 6, 7, 8, 9, 11 };
        int k = 5;
        return search(f,k);
    }

    private int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == key)
                return i;
        return -1;
    }
}
