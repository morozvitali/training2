import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FileData extends File {

    String fileName;
    String filePath;
    byte size;


    public static void main(String[] args) {
        FileData fd = new FileData("txt.txt");


        // тут создали
        try {
            fd.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // тут назва файла
        System.out.println(fd.getName());

        //повернути щлях до файлу з фалйом
        fd.getPath();

        // повернути шлях ббез імені файлу
        fd.getParent();

        //повернути розмір у лонг але треба бьайт
        fd.getTotalSpace();

        // що робить невідомо        fd.list();
        // невідомо але схоже треба         fd.length();
        //



        // тут удалили
        fd.delete();

        // тут читали
        //https://javadevblog.com/kak-sozdat-novyj-fajl-v-java.html
    }




    public FileData(String pathname) {
        super(pathname);
    }

    public FileData(String parent, String child) {
        super(parent, child);
    }

    public FileData(File parent, String child) {
        super(parent, child);
    }

    public FileData(URI uri) {
        super(uri);
    }
}

