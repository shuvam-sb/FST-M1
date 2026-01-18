package activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class Activity14 {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/newfile.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        FileUtils.writeStringToFile(file, "Hello File Utils", StandardCharsets.UTF_8);

        String newtext = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        System.out.println("Data in new file: " + newtext);

        File destDir = new File("src/main/resources/destDir");
        destDir.mkdirs();

        FileUtils.copyFileToDirectory(file, destDir);

        File copiedFile = new File(destDir, "newfile.txt");
        String dirtext = FileUtils.readFileToString(copiedFile, StandardCharsets.UTF_8);
        System.out.println("Data in copied file: " + dirtext);
    }
}
