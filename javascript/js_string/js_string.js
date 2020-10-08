/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-12 16:56:24
 * @LastEditTime: 2020-08-26 21:40:02
 * @FilePath: \web\js_string\js_string.js
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
function deal_string(deal_num)
{
    var src = document.getElementById("src").value;
    var way = document.getElementById("way").value;
    var dest;       //存储处理结果

    switch(deal_num)
    {
        case 1:
            //返回在指定位置的字符
            dest = src.charAt(Number(way));
            break;

        case 2:
            //lastIndexOf();从后向前搜索字符串
            dest = src.indexOf(way);
            break;

        case 3:
            var start = way.substr(0, 1);
            var length = way.substr(2,1);
            
            //字符串中抽取从第一个参数下标开始的指定数目（第二个参数）的字符
            dest = src.substr(Number(start), Number(length));
            break;

        case 4:
            var start = way.substring(0, 1);
            var stop = way.substring(2);

            //提取字符串中介于两个指定下标之间的字符
            dest = src.substring(Number(start), Number(stop));
            //dest = src.substring(2);//提取字符串从2开始以后的字符
            
            break;
    }

    //显示结果
    document.getElementById("dest").value = dest;
}