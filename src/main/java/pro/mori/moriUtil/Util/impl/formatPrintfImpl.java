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
        int[] maxLength = new int[]{0, 0, 0, 0};
        for (ContractList n : print){
            maxLength[0] = Math.max(maxLength[0],n.getName().length());
            maxLength[1] = Math.max(maxLength[1],n.getAmount().length());
            maxLength[2] = Math.max(maxLength[1],n.getType().length());
            maxLength[3] = Math.max(maxLength[2],n.getGroup().length());
        }
        for (int n = 0; n < maxLength.length; n++){
            maxLength[n] += 5;
        }

        for (ContractList n : print){
            System.out.printf("%-*s",maxLength[0],n.getName());
            System.out.printf("%*s",maxLength[1],n.getAmount());
            System.out.printf("%*s",maxLength[2],n.getType());
            System.out.printf("%*s%n",maxLength[3],n.getGroup());
        }

    }

    @Override
    public void outPrintln(String print) {
        System.out.println(ConsoleConfig.ConsoleHead + print);
    }

    @Override
    public void outPrintf(String print) {
        System.out.print(ConsoleConfig.ConsoleHead + print);
    }
}
