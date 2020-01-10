package pro.mori.moriUtil.Util;

import pro.mori.moriUtil.model.ContractList;

import java.util.List;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

public interface EveTypeCut {

    //劫持输入并对内容进行初步分割处理
    List<Object> cutInputInfo();

    List<ContractList> cutEveListInfo(List<String> req);
}
