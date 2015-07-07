package me.ugurcan.sozlukapi;

import java.util.Locale;

public class Utils {

    protected static String replaceTurkishChars(String input) {

        if (input.contains("Ç") || input.contains("ç") || input.contains("Ğ") || input.contains("ğ") || input.contains("İ") ||
                input.contains("ı") || input.contains("Ö") || input.contains("ö") || input.contains("Ş") || input.contains("ş") ||
                input.contains("Ü") || input.contains("ü"))
            input = input.toLowerCase(new Locale("TR", "tr"));
        else
            input = input.toLowerCase(Locale.ENGLISH);

        return input.replaceAll("Ç", "%c3%87").replaceAll("ç", "%c3%a7").replaceAll("Ğ", "%c4%9e").replaceAll("ğ", "%c4%9f").replaceAll("İ", "%c4%b0")
                .replaceAll("ı", "%c4%b1").replaceAll("Ö", "%c3%96").replaceAll("ö", "%c3%b6").replaceAll("Ş", "%c5%9e").replaceAll("ş", "%c5%9f")
                .replaceAll("Ü", "%c3%9c").replaceAll("ü", "%c3%bc");

    }

}
