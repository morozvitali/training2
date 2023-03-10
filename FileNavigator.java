import java.util.ArrayList;
import java.util.HashMap;

public class FileNavigator extends HashMap <String,ArrayList<FileData>[]> {
    private final String pathName;
    private ArrayList<FileData>[] list;

    public FileNavigator (String pathName, ArrayList<FileData>[] list) {
        this.pathName = pathName;
        this.list = list;
    }
    public void add (String pathName) {


            if (this.pathName.contains(pathName)) {
            FileData fd =
            fd.fileName = fd.getName(); ///???
            list.add (new FileData(pathName));
            } else{
            //якщо ключа не існує то створюємо арей ліст як ключ
            //                  додаємо файл до аррей листу

            ArrayList <FileData> [] keyArray = new ArrayList[]{};
            hashMap.put(pathName, keyArray.add(new FileData(pathName)));
            key.add(new FileData(pathName));
        }

        // створюємо файл, в нас є шлях і назва
        // Якщо запис вже існує то додати файл (обєкт)
        // до переліку з файлами у масиві шляхів
        // 2. Реалізувати метод add у класі FileNavigator.
        // Цей метод додає файл за вказаним шляхом.

       // boolean createNewFile () {
            /** створює новий файл по шляху, який переданий в конструктор.
            У разі вдалого створення повертає true, інакше false **/
        //}

        // Якщо шлях вже існує, новий файл необхідно додати
        // до списку (List!) stаtic класу,
        // вже пов'язаному з відповідним шляхом.
        // ВАЖЛИВО: Шлях – унікальне значення і не повинно повторюватися.

    }

    public void find (String PATH) {

        //3. Реалізувати метод find у класі FileNavigator.
        // Метод повертає список файлів,
        // пов'язаних з шляхом переданим як параметр.

        /** (метод передає у мап - шлях, поверає список файлів по шлясі) **/

        /** boolean exists (): перевіряє,
        чи існує за вказаним в конструкторі шляху файл
        або каталог. І якщо файл або каталог існує,
        то повертає true, інакше повертає false **/
    }

    public void filterBySize (String PATH) {

        //4. Реалізувати метод filterBySize у класі FileNavigator.
        // Метод повертає список файлів, розмір (в байтах)
        // яких не перевищує значення, передане як параметр.

        // метод передає значення у байтах

        // long length (): повертає розмір файлу в байтах
        // String [] list (): повертає масив файлів і підкаталогів,
        // які знаходяться в певному каталозі
        //boolean mkdir (): створює новий каталог
        // і при вдалому створенні повертає
        //значення true


    }

    public void remove (String PATH) {

        // 5. Реалізувати метод remove у класі FileNavigator.
        // Метод видаляє шлях і пов'язані з ним файли,
        // виходячи з значення шляху, переданого як параметр.

        /** boolean delete (): видаляє каталог або файл по шляху,
         який переданий в
         конструктор. При вдалому видаленні повертає true.
         */



    }

    public void sortBySize (String PATH) {

        //6. * Реалізувати метод sortBySize у класі FileNavigator.
        // Метод сортує всі наявні файли за розміром (за зростанням),
        // потім повертає список відсортованих файлів.

    }

    {

        //7. ** Реалізувати перевірку консистентності
        // у методі add у класі FileNavigator.
        // Не дозволяти додавати значення
        // і повідомити про це в консолі,
        // при спробі додати значення FileData
        // значення шляху якого не відповідає шляху-ключу,
        // що веде до списку файлів.

        //        Наприклад:
        //Має бути помилка, оскільки шлях-ключ і шлях до файлу не співпадають

        //Шлях: /path/to/file
        //FileData: {name: ..., size: ..., path: /another/path/}

    }

}
