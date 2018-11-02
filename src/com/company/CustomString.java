package com.company;

public class CustomString {
    private String string;

    public CustomString(String string) {
        this.string = string;
    }

    public Integer searchWordByLetter(String searchingWord, Integer fromIndex) {
        for (int i = fromIndex; i < this.string.length(); i++) {
            Integer indexOfWord = 0;
            while (searchingWord.charAt(indexOfWord) == this.string.charAt(i)) {
                indexOfWord++;
                if (indexOfWord.equals(searchingWord.length())) {
                    return i - (indexOfWord - 1);
                }
            }
        }

        return -1;
    }
}
