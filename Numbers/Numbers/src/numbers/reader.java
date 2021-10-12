/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Marcel.Lindinger
 */
public class reader {

    public int og;

    public reader(int og) {
        this.og = og;
    }

    public void readOnlyNumbers() throws FileNotFoundException {
        File numbersCsv = new File("/Programmieren_3A/Hue3/Numbers/Numbers/numbers.csv");
        List<Integer> numbers = new ArrayList<>();
        if (numbersCsv.isFile()) {
            BufferedReader br = new BufferedReader(new FileReader(numbersCsv));
            while ((row = numbersCsv.readLine()) != null) {

                String[] trenn = row.split(",");
            }
        }
    }
}
