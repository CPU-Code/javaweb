/**
 * @author : cpucode
 * @date : 2021/3/22
 * @time : 10:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

//引入 node.js 内置http模块
var http = require("http");

//创建并监听web服务器
http.createServer(function (requst, response){
    //发送http头部
    //参数1:响应状态码,200表示成功
    //参数2:响应头部信息,Content-Type内容类型:纯文本
    response.writeHead(200, {"Context-Type": "text/plain"});

    //发送响应数据
    response.end("Hello cpucode \n");
}).listen(8888);

console.log("服务器运行在 http://127.0.0.1:8888");