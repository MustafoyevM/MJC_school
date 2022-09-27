package talks.mjc_stage1.NIO;

import talks.mjc_stage1.java_io.task1.FileReader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        talks.mjc_stage1.java_io.task1.FileReader reader = new FileReader();
        System.out.println(reader.getDataFromFile(new File("Profile.txt")));
    }
}
