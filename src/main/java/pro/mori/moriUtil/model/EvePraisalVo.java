package pro.mori.moriUtil.model;

import javafx.beans.DefaultProperty;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : Mori
 * @Version : 1.0
 * @Date : 2020/1/9
 * @ProjectName : doomTest
 **/
@Getter
@Setter
public class EvePraisalVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String market;

    private String raw_textarea;


}
