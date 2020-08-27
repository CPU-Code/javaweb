/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-08-27 19:16:23
 * @LastEditTime: 2020-08-27 19:26:42
 * @FilePath: \web\cgi\cgi-bin\_cgi3.c
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	char *dataLen = NULL;
	char buff[100] = {0};
	float a = 0.0, b = 0.0;
	char  c = 0;
	int len = 0;
	
	// 传输 HTML 文本第一行输出的内容必须是”Content-Type:text/html”
	printf("content-type:text/html\n\n");

	// CONTENT_LENGTH : 在浏览器端以 POST 方法输入的数据的字节数， 数据的内容通过标准输入获取
	dataLen = getenv("CONTENT_LENGTH");
	
	if(NULL == dataLen)
	{
		printf("error1");

		return 0;
	}
	else
	{
		len = atoi(dataLen);

		if(len > 0)
		{
			if(NULL == fgets(buff, len + 1, stdin))	//buff == "12+23"
			{
				printf("error2");

				return 0;
			}
			else
			{
				sscanf(buff, "%f%c%f", &a, &c, &b);

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
					printf("error3");
				}
				
			}	
		}
	}
	
	return 0;
}
