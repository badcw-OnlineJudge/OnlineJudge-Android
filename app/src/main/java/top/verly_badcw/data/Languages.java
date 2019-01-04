package top.verly_badcw.data;

import java.util.Locale;

public enum Languages {

    ENGLISH("english", "en"),
    CHINESE("中文", "zh");

    private String name;
    private String code;

    Languages(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String nativeName(){
        return name;
    }

    public String code(){
        return code;
    }

    public static Languages matchLocale(Locale locale){
        return matchCode(locale.getLanguage());
    }

    public static Languages matchCode(String code){
        for (Languages lang : Languages.values()){
            if (lang.code().equals(code))
                return lang;
        }
        return ENGLISH;
    }

}