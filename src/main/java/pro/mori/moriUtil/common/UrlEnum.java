package pro.mori.moriUtil.common;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : doomTest
 **/

public enum  UrlEnum {

    EVE_PRICE_API(1,"https://evepraisal.com/appraisal.json");

    private int code;

    private String mag;

    UrlEnum(int code,String msg){
        this.code = code;
        this.mag = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMag() {
        return mag;
    }
}
