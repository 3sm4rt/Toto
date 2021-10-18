package Main;

import data.FileBasedDataStore;

public class Main {

    public static void main(String[] args) {
        FileBasedDataStore file = new FileBasedDataStore();
        file.loadCsv();
    }
}
