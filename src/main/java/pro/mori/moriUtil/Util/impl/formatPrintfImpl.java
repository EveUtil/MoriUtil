package pro.mori.moriUtil.Util.impl;

import pro.mori.moriUtil.Util.FormatPrintf;
import pro.mori.moriUtil.config.ConsoleConfig;
import pro.mori.moriUtil.model.ContractList;

import java.util.List;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

public class formatPrintfImpl implements FormatPrintf {


    @Override
    public void listStringPrintf(List<String> print) {
        for (String s : print){
            System.out.println(ConsoleConfig.ConsoleHead + s);
        }
    }
    @Override
    public void listContractPrintf(List<ContractList> print) {

        for (int n = 0; n < print.size(); n++){
            outPrintln(n);
            outTwoPrintln(print.get(n).getName());
            outTwoPrintln(print.get(n).getAmount());
            outTwoPrintln(print.get(n).getType());
            outTwoPrintln(print.get(n).getGroup());
        }

    }

    @Override
    public void outPrintln(String print) {
        System.out.println(ConsoleConfig.ConsoleHead + print);
    }
    @Override
    public void outPrintln(int print) {
        System.out.println(ConsoleConfig.ConsoleHead + print);
    }

    @Override
    public void outTwoPrintln(String print) {
        System.out.println(ConsoleConfig.ConsoleKong + print);
    }

    @Override
    public void outPrintf(String print) {
        System.out.print(ConsoleConfig.ConsoleHead + print);
    }
}
