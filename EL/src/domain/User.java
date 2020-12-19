/**
 * User: cpucode
 * Date: 2020/12/19
 * Time: 16:57
 * Github: https://github.com/CPU-Code
 * CSDN: https://blog.csdn.net/qq_44226094
 */

package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private double money;
    private Date birthday;

    public User(int id, String name, double money, Date birthday){
        this.id = id;
        this.name = name;
        this.money = money;
        this.birthday = birthday;
    }

    public User() {}

    //逻辑视图
    public String getBirStr(){
        if (birthday != null){
            //1.格式化日期对象
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //2.返回字符串即可
            return simpleDateFormat.format(birthday);

        } else {
            return "";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
