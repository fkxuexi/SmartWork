package top.fkxuexi.enums;

/**
 * @version v1.0.0
 * @Author fkxuexi
 * @Date 2018/1/4 22:05
 * @QQ群 570980002
 * @Description : 支付方式的枚举类
 */
public enum PayWayEnum {

    WX_APP(1),

    WX_H5(2),

    WX_MICRO(3),

    ALIPAY_APP(4),

    ALIPAY_H5(5);


    private int way;

    PayWayEnum(int way) {
        this.way = way;
    }


    public int getWay() {
        return way;
    }
}
