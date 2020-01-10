package pro.mori.moriUtil.common;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

public enum  FinalEnum {
    //UrlEcode 中选择市场字段
    MARK(1,"market"),

    //UrlEcode 中内容字段
    ROW_LIST(2, "raw_textarea"),

    URL_ONE(3 ,"?"),

    URL_DENG(4, "="),

    URL_AND(5, "&");

    private int Code;

    private String Name;



    FinalEnum(int code,String name){
        this.Code = code;
        this.Name = name;
    }

    public int getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }
}
