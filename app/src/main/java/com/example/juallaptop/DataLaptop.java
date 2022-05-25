package com.example.juallaptop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataLaptop {
    private static String[] namaLaptop = {
            "LENOVO LEGION 5",
            "ASUS VivoBook 14 A412FA",
            "ASUS TUF Gaming FX505DY",
            "ASUS ROG Zephyrus G14 GA401",
            "MacBook Pro 13inc 2020",
            "Hp Envy x350",
            "ACER Nitro 5",
            "DELL ALIENWARE 14",
            "MSI ge62vr 7rf",
            "MacBook Pro ME293",
    };

    private static String [] detailLaptop = {
            "Windows 10, Ram 32 GB, SSD 1 TB, Processor AMD Ryzen 7 4800H,VGA GeForce GTX 1650, Layar 15.6 inch ",
            "Windows 10, Ram 4Gb, SSD 512GB, Processor Intel Core i5, Layar 14inc ",
            "Windows 10, Ram 8Gb, HDD 1TB, Processor AMD Ryzen 5, Layar 15,6inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core i7 , Layar 15.6inc ",
            "macOS , Ram 8Gb, SSD 256GB, Processor Intel Core i5 3.8GHz, Layar 13.3inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core i5 , Layar 15.6inc ",
            "Windows 11 , Ram 8Gb, SSD 512GB, Processor AMD Ryzen 5 , Layar 15.6inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core  i7, VGA Geforce™ GTX765M, Layar 14inc ",
            "Windows 10 , Ram 16Gb, SSD 512GB, Processor Intel Core  i7, VGA Geforce GTX1060 6GB, Layar 15.6inc ",
            "macOS , Ram 8Gb, SSD 512GB, Processor Intel Core  i7, VGA Iris 5200 Pro graphics, Layar 15inc ",

    };
    private static int[] fotoLaptop = {
            R.drawable.lenovo_legion5,
            R.drawable.asus_vivo_book,
            R.drawable.asus_tuff_gaming,
            R.drawable.asus_rog_zephyrus,
            R.drawable.macbook_pro13,
            R.drawable.hp_envy,
            R.drawable.acer_nitro,
            R.drawable.dell_alienware14,
            R.drawable.msi_ge62vr_7rf,
            R.drawable.mac_pro,
    };

    static ArrayList<laptop> getListData(){
        ArrayList<laptop> list = new ArrayList<>();
        for (int position = 0; position < namaLaptop.length; position++){
            laptop laptop = new laptop();
            laptop.setNamaLaptop(namaLaptop[position]);
            laptop.setDetailLaptop(detailLaptop[position]);
            laptop.setFotoLaptop(fotoLaptop[position]);
            list.add(laptop);
        }
        return list;
    }
}
