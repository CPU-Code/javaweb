/*
 * @????????, ??????, ????:  
 * @Author: cpu_code
 * @Date: 2020-08-27 19:16:23
 * @LastEditTime: 2020-08-27 19:23:56
 * @FilePath: \web\cgi\cgi-bin\_cgi1.c
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
#include <stdio.h>

int main(void)
{
	// 传输 HTML 文本第一行输出的内容必须是”Content-Type:text/html”
	printf("content-type:text/html\n\n");
	
	printf("<html>\n<TITLE>CGI1:CGI hello!</TITLE>\n");
	printf("<center><H1>hello, 祥祥你好 </H1></center>\n");
	printf("<center><H1>hello, this is frist CGI demo! </H1></center>\n</html>");
	
	return 0;
}