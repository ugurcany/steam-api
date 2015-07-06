package me.ugurcan.sozlukapi;

import java.util.Locale;

public class Utils {

    protected static String replaceTurkishChars(String input) {

        Locale tr = new Locale("TR","tr");
        input = input.toLowerCase(tr);

        return input.replaceAll("Ç", "%c3%87").replaceAll("ç", "%c3%a7").replaceAll("Ğ", "%c4%9e").replaceAll("ğ", "%c4%9f").replaceAll("İ", "%c4%b0")
                .replaceAll("ı", "%c4%b1").replaceAll("Ö", "%c3%96").replaceAll("ö", "%c3%b6").replaceAll("Ş", "%c5%9e").replaceAll("ş", "%c5%9f")
                .replaceAll("Ü", "%c3%9c").replaceAll("ü", "%c3%bc");

    }

}
