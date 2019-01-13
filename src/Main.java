import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) throws Exception{
	    System.out.println("Лабораторная работа №4");
        System.out.println("ПЭ-171 Удовенко Владислав Валерьевич");
        System.out.println("Условие: Спроектировать архитектуру ПО  для перезаписи текстовых файлов с отображением скорости записи.");
        System.out.println("=======================================================================================");
        System.out.println("Введите путь к файлу для считывания: ");
        Scanner scanR = new Scanner(System.in);
        String pathRead = scanR.next();
        File FileRead = new File(pathRead);
        System.out.println("Введите путь к файлу для записи: ");
        Scanner scanW = new Scanner(System.in);
        String pathWrite = scanW.next();
        File FileWrite = new File(pathWrite);
        ReaderAndSaver ras = new ReaderAndSaver();
        ras.ReadWrite(pathRead,pathWrite);
    }
}
//C:\Users\Asus\Desktop\Экзамены\sds.txt
//C:\Users\Asus\Desktop\Экзамены\ssf.txt