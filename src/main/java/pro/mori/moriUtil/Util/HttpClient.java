package pro.mori.moriUtil.Util;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : EveTest
 **/

public interface HttpClient {


    String postGeneralUrl(String generalUrl, String contentType, String params) throws Exception;

    String getParam(String[] param);

}
