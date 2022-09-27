package talks.mjc_stage1.java_io.task1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        System.out.println(reader.getDataFromFile(new File("Profile.txt")));
    }
}
