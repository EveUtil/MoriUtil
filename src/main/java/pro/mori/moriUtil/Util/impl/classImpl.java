package pro.mori.moriUtil.Util.impl;

import pro.mori.moriUtil.Util.ClassUtil;

public class classImpl implements ClassUtil {
    @Override
    public String getClassPath(Class<?> cls){
        return cls.getProtectionDomain().getCodeSource().getLocation().getPath();
    }


}
