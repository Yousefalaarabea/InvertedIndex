/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invertedIndex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ehab
 */
public class Test {


    public static void main(String args[]) throws IOException {
        Index5 index = new Index5();
        String files = "D:/Third_Year/Third Year/Second term/IR/Ass1/tmp11/rl/collection/";

        File file = new File(files);
        String[] fileList = file.list();

        fileList = index.sort(fileList);
        index.N = fileList.length;

        for (int i = 0; i < fileList.length; i++) {
            fileList[i] = files + fileList[i];
        }
        index.buildIndex(fileList);
        index.store("index");
        index.printDictionary();

        String test3 = "data should plain greatest comif";
        System.out.println("Boo0lean Model result = \n" + index.find_24_01(test3));

        String phrase = "";
        do {
            System.out.println("Print search phrase: ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            phrase = in.readLine();
            if (!phrase.isEmpty()) {
                System.out.println("Search result: \n" + index.find_24_01(phrase)); // Call find_24_01 method with the entered phrase
            }
        } while (!phrase.isEmpty());
    }

}
