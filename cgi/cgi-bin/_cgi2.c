/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-27 19:16:23
 * @LastEditTime: 2020-08-27 19:25:07
 * @FilePath: \web\cgi\cgi-bin\_cgi2.c
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	char *data = NULL;
	float a = 0.0, b = 0.0;
	char  c = 0;

	// 传输 HTML 文本第一行输出的内容必须是”Content-Type:text/html”
	printf("content-type:text/html\n\n");

	// QUERY_STRING : 在浏览器端以 GET 的方法输入的数据， 数据的内容就是 url 问号后的内容
	data = getenv("QUERY_STRING");//12+23

	if(NULL == data)
	{
		printf("error");
		return 0;
	}

	//printf("data is:%s\n", data);
	sscanf(data, "%f%c%f",&a, &c, &b);
	
	if('+' == c)
	{
		printf("%f", a + b);
	}
	else if('-' == c)
	{
		printf("%f", a - b);
	}
	else
	{
		printf("error");
	}
	
	return 0;
}