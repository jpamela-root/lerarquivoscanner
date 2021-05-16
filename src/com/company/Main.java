package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    class LerArquivoComScanner {
        public static void main(String[] args) throws FileNotFoundException {
            File arquivo = new File("C:\\temp\\arquivo.txt");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNext()) {
                System.out.print(sc.nextLine());
            }
            sc.close();
        }
    }
