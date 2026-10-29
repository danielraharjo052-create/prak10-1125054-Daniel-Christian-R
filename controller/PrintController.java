
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Mahasiswa;
import util.PrintUtil;
import view.PrintView;

public class PrintController {

    private PrintView view = new PrintView();

    public void runProgram() {

        List<String> daftarBuah = new ArrayList<>();
        daftarBuah.add("Strawwberry");
        daftarBuah.add("Anggur");
        daftarBuah.add("Delima");

        Integer[] angka = {30, 10, 20};

        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa("103", "Jawa"));
        daftarMahasiswa.add(new Mahasiswa("101", "Ireng"));
        daftarMahasiswa.add(new Mahasiswa("102", "Danil"));

        Mahasiswa[] arrayMahasiswa = {
            new Mahasiswa("103", "Jawa"),
            new Mahasiswa("101", "Ireng"),
            new Mahasiswa("102", "Danil")
        };

        view.printTitle("print listnya");
        PrintUtil.printList(daftarBuah);

        view.printTitle("print array");
        PrintUtil.printList(angka);

        view.printTitle("print printable list");
        PrintUtil.printPrintableList(daftarMahasiswa);

        view.printTitle("print sorted list");
        PrintUtil.printListSorted(daftarMahasiswa);

        view.printTitle("list asli stlah sort");
        PrintUtil.printPrintableList(daftarMahasiswa);

        view.printTitle("sorted array");
        PrintUtil.printListSorted(arrayMahasiswa);

        view.printTitle("array asli stlah sort");
        PrintUtil.printPrintableList(Arrays.asList(arrayMahasiswa));
    }
}
