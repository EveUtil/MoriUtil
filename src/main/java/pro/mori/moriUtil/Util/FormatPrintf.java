package pro.mori.moriUtil.Util;

import pro.mori.moriUtil.model.ContractList;

import java.util.List;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

public interface FormatPrintf {

    void listStringPrintf(List<String> print);

    void outPrintln(String print);

    void outPrintln(int print);

    void outTwoPrintln(String print);

    void outPrintf(String print);

    void listContractPrintf(List<ContractList> print);
}
