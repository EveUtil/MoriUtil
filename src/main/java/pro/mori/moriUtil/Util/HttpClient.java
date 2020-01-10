package pro.mori.moriUtil.Util;

import com.alibaba.fastjson.JSONObject;
import pro.mori.moriUtil.model.PostInfo;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : EveTest
 **/

public interface HttpClient {


    JSONObject postGeneralUrl(PostInfo postInfo) throws Exception;

    String getParam(String[] param);

}
