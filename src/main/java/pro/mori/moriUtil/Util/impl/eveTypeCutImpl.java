package pro.mori.moriUtil.Util.impl;

import pro.mori.moriUtil.Util.EveTypeCut;
import pro.mori.moriUtil.Util.FormatPrintf;
import pro.mori.moriUtil.Util.FormatUtil;
import pro.mori.moriUtil.model.ContractList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

public class eveTypeCutImpl implements EveTypeCut {
    private FormatUtil formatUtil = new formatImpl();

    /**
     * 进行输入并内容进行初步处理
     * @Author : Mori
     * @Time : 2020/1/10 15:06
     */
    @Override
    public List<Object> cutInputInfo() {
        Scanner input = new Scanner(System.in);
        List<String> infoList = new ArrayList<>();
        String info = "";
        //对输入内容进行初步分割处理
        System.out.println("请输入内容 : ");
        do {
            String string = input.nextLine();
            if (string.equals("")) {
                break;
            }
            info += string;
            infoList.add(string);

        } while (true);
        //返回数列 0为原始内容(String) 2为分割内容(List<String>)
        List<Object> returnList = new ArrayList<>();
        returnList.add(info);
        returnList.add(infoList);
        
        return returnList;
    }

    /**
     * 对Eve种合同内容进行分割处理
     * @Author : Mori
     * @Time : 2020/1/10 15:48
     *
     * @param req
     */
    @Override
    public List<ContractList> cutEveListInfo(List<String> req) {

        List<ContractList> returnList = new ArrayList<>();

        for (String s : req){
            String[] cutInfo = s.split("\t");
            ContractList listInfo = new ContractList();
            for (int y = 0; y < cutInfo.length; y++){
                switch (y){
                    case 0 : {
                        listInfo.setName(formatUtil.deleteCharString(cutInfo[y],'*'));
                    }break;
                    case 1 : {
                        listInfo.setAmount(cutInfo[y]);
                    }break;
                    case 2 : {

                        listInfo.setType(formatUtil.deleteCharString(cutInfo[y],'*'));
                    }break;
                    case 3 : {

                        listInfo.setGroup(formatUtil.deleteCharString(cutInfo[y],'*'));
                    }break;
                }
            }
            returnList.add(listInfo);
        }
        return returnList;
    }

}
