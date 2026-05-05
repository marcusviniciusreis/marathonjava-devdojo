package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }



}
