package pro.mori.moriUtil.Util.impl;

import pro.mori.moriUtil.Util.FormatUtil;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : doomTest
 **/

public class formatImpl implements FormatUtil {

    @Override
    public String test() {
        return "test";
    }

    @Override
    public String deleteCharString(String sourceString, char chElemData) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < sourceString.length(); i++) {
            if (sourceString.charAt(i) != chElemData) {
                stringBuffer.append(sourceString.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
