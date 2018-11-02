package com.company;

public class Test {
    private String searchingWord;
    private String[] stringsList;
    private Integer[] searchingResults;

    public Test() {
        this.searchingWord = "ни";
        this.stringsList = new String[] {
                "Когда убили Лорку,- а ведь его убили!-",
                "жандарм дразнил молодку, красуясь на кобыле.",
                "Когда убили Лорку,- а ведь его убили!-",
                "сограждане ни ложку, ни миску не забыли.",
        };
        this.searchingResults = new Integer[] {1, 3, 3};
    }

    public Boolean searchingTest() {
        if (!this.simpleSearchingMethod()) return false;
        if (!this.customSearchingMethod()) return false;
        return true;
    }

    private Boolean simpleSearchingMethod() {
        Search s = new Search(this.stringsList);
        Integer[] out = s.searchByWordBasic(this.searchingWord);
        for (int i = 0; i < out.length; i++) {
            if (!out[i].equals(this.searchingResults[i])) return false;
        }
        return true;
    }

    private Boolean customSearchingMethod() {
        Search s = new Search(this.stringsList);
        Integer[] out = s.searchByWordSpecial(this.searchingWord);
        for (int i = 0; i < out.length; i++) {
            if (!out[i].equals(this.searchingResults[i])) return false;
        }
        return true;
    }
}
