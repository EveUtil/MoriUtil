package pro.mori.moriUtil.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 解析Post接口需要数据
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/
@Getter
@Setter
public class PostInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;

    private String type;

    private String param;


}
