/**
 * @author : cpucode
 * @date : 2021/3/22
 * @time : 10:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

var http = require('http');

http.createServer(function (request, response) {
    // 发送 HTTP 头部
    // HTTP 状态值: 200 : OK
    // 内容类型: text/plain
    response.writeHead(200, {'Content-Type': 'text/plain'});

    // 发送响应数据 "Hello Cpucode"
    for(var i=0;i<10;i++){
        response.write(i + ' Hello Cpucode\n');
    }

    response.end('');
}).listen(8888);

// 终端打印如下信息
console.log('Server running at http://127.0.0.1:8888/');