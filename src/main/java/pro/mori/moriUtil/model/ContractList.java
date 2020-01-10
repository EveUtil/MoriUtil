package pro.mori.moriUtil.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 解析输入单个物品信息
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/10
 * @ProjectName : EveTest
 **/

@Data
public class ContractList implements Serializable {
    private static final long serialVersionUID = 1L;

    //物品名称
    private String Name;

    //物品数量
    private String Amount;

    //物品类别
    private String Group;

    //物品类型
    private String Type;

}
