package pro.mori.moriUtil.Util.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import pro.mori.moriUtil.Util.HttpClient;
import pro.mori.moriUtil.common.FinalEnum;
import pro.mori.moriUtil.model.PostInfo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : EveTest
 **/

public class httpClientImpl implements HttpClient {

    @Override
    public JSONObject postGeneralUrl(PostInfo postInfo){
        String result = "";
        HttpPost post = new HttpPost(postInfo.getUrl());
        try {
            OutputStreamWriter out = null;
            StringBuilder buffer = new StringBuilder();
            try {
                // 1.连接部分
                URL url = new URL(
                        postInfo.getUrl());
                // http协议传输
                HttpURLConnection httpUrlConn = (HttpURLConnection) url
                        .openConnection();

                httpUrlConn.setDoOutput(true);
                httpUrlConn.setDoInput(true);
                httpUrlConn.setUseCaches(false);
                // 设置请求方式（GET/POST）
                httpUrlConn.setRequestMethod("GET");
                httpUrlConn.setRequestProperty("content-type", postInfo.getType());

                // 2.传入参数部分
                // 得到请求的输出流对象
                out = new OutputStreamWriter(httpUrlConn.getOutputStream(),
                        StandardCharsets.UTF_8);
                // 把数据写入请求的Body
                out.write(postInfo.getParam()); // 参数形式跟在地址栏的一样

                out.flush();
                out.close();

                // 3.获取数据
                // 将返回的输入流转换成字符串
                InputStream inputStream = httpUrlConn.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(
                        inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(
                        inputStreamReader);

                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    buffer.append(str);
                }
                bufferedReader.close();
                inputStreamReader.close();
                // 释放资源
                inputStream.close();
                httpUrlConn.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return JSONObject.parseObject(buffer.toString());
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getParam(String[] param) {
        String URLEcode =
                        FinalEnum.URL_ONE.getName()
                        + FinalEnum.MARK.getName()
                        + FinalEnum.URL_DENG.getName()
                        + param[0]
                        + FinalEnum.URL_AND.getName()
                        + FinalEnum.ROW_LIST.getName()
                        + FinalEnum.URL_DENG.getName()
                        + param[1];

        System.out.println("-------------------------------------");
        System.out.println(URLEcode);
        System.out.println("-------------------------------------");
        return URLEcode;
    }


}

