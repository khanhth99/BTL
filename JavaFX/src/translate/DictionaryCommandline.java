package translate;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandline extends DictionaryManagement {

    // hien thi ket qua tu danh sach tu dien

    public void dictionaryBasic() {
        insertFromCommandline();

    }

    public void dictionaryAdvanced() {
        insertFromFile();

    }


    public ArrayList<Word> getSearch(String text)
    {

        ArrayList<Word> data = new ArrayList<Word>();

        String wordSearch = text;
        for (Word ele : Dictionary.listWord) {
            if (ele.getWord_taget().indexOf(wordSearch) == 0) {
                data.add(ele);
            }
        }

        if (data.isEmpty()) {
            System.out.println("Không có trong từ điển !!!");
        } else {
            //System.out.println("(Các) từ bắt đầu bằng \"" + wordSearch + "\": ");
            int i = 1;
            for (Word ele : data) {
                System.out.printf("%-4d", i);
                ele.printWord();
                i++;
            }
        }

        return data;
    }

}