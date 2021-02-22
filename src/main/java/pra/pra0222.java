package pra;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class pra0222 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(
                "raf.dat","rw"
        );
        long pos = raf.getFilePointer();
        System.out.println("pos:"+pos);


    }

}
