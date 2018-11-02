package com.company;

import java.util.ArrayList;

public class Search {
    private String[] stringsList;

    public Search(String[] stringsList) {
        this.stringsList = stringsList;
    }

    public Integer[] searchByWordBasic(String searchingWord) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < this.stringsList.length; i++) {
            Integer index = 0;
            while (!index.equals(-1)) {
                index = this.stringsList[i].indexOf(searchingWord, index);
                if (!index.equals(-1)) {
                    result.add(i);
                    index++;
                }
            }
        }
        Integer[] out = new Integer[result.size()];
        for (int i = 0; i < result.size(); i++) {
            out[i] = result.get(i);
        }
        return out;
    }

    public Integer[] searchByWordSpecial(String searchingWord) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < this.stringsList.length; i++) {
            Integer index = 0;
            while (!index.equals(-1)) {
                CustomString s = new CustomString(this.stringsList[i]);
                index = s.searchWordByLetter(searchingWord, index);
                if (!index.equals(-1)) {
                    result.add(i);
                    index++;
                }
            }
        }
        Integer[] out = new Integer[result.size()];
        for (int i = 0; i < result.size(); i++) {
            out[i] = result.get(i);
        }
        return out;
    }
}
