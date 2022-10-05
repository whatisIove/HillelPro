package ua.ithillel.homework9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextHelper {

    private final static String filePath = "resources/file.txt";

    static void fileWrite(String text) throws IOException {
        final String path = createFolderIfNotExist();
        try (final FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(text);
        }
    }

    private static String createFolderIfNotExist() throws IOException {
        final Path pathToFile = Paths.get(filePath);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        return filePath;
    }

    public static void fileCheck(String text) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        if (text.isBlank()) {
            System.err.println("Write failed, file is empty!!!");
        } else {
            System.out.println("File write successful!");
        }
        scanner.close();
        fileReader.close();
    }

    public static void fileRead() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            System.out.println("\n" + string);
        }
        scanner.close();
        fileReader.close();
    }
}
