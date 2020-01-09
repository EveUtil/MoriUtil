package pro.mori.moriUtil.common;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : EveTest
 **/

public enum  HttpEnum {
    FROM(1,"application/x-www-form-urlencoded");

    private int Code;

    private String Type;

    HttpEnum(int code,String type){
        this.Code = code;
        this.Type = type;
    }

    public int getCode() {
        return Code;
    }

    public String getType() {
        return Type;
    }
}
