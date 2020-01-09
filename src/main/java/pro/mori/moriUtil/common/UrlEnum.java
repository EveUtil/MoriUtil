package pro.mori.moriUtil.common;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : doomTest
 **/

public enum  UrlEnum {

    EVE_PRICE_API("Url-01","https://evepraisal.com/appraisal.json");
//    EVE_PRICE_API("Url-01","https://evepraisal.com/appraisal.json");

    private String code;

    private String mag;

    UrlEnum(String code,String msg){
        this.code = code;
        this.mag = msg;
    }

    public String  getCode() {
        return code;
    }

    public String getMag() {
        return mag;
    }
}
