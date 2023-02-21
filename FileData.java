//import java.nio.file.Files;
//import java.io.File;
//public class FileData {
//1. Створити клас FileData.
// Клас представляє конкретний файл і складається з:
// ім'я файлу, розміру в байтах, шлях до файлу.
//
//    private String name;
//    private byte size;
//    private String path;
//
//    //конструктор
//
//    public FileData() {
//        this.name = name;
//        this.path = path;
//    }


import java.io.File;
import java.io.IOException;

public class FileData {
    public FileData(String name, String pathname) {


        //public static void main(String[] args) {
// створимо дані обєкту
        File myFile = new File("C://SomeDir//notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if (myFile.exists())
            System.out.println("File exists");
        //else
        //    System.out.println("File not found");
        //System.out.println("File size: " + myFile.length());
        //if (myFile.canRead())
        //    System.out.println("File can be read");
        //else
        //    System.out.println("File can not be read");
        //if (myFile.canWrite())
        //    System.out.println("File can be written");
        //else
        //    System.out.println("File can not be written");
// створимо цей обєкт
        File newFile = new File("C://SomeDir//MyFile");
        try {
            boolean created = newFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

