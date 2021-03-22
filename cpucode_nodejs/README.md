
# [cpucode_nodejs](../README.md)

- [x] [demo__加法控制台输出](node/demo.js)
- [x] [function__函数调用](node/function.js)
- [x] [require__模块](node/module/require.js)
- [x] [http__web服务器](node/http.js)
- [x] [forHttp__服务端渲染](node/forHttp.js)
- [x] [parameter__接收参数](node/parameter.js)
- [x] [index__webpack测试](webpack/index.html)

-----------------


初始化

```shell script
npm init
```


本地安装

```shell script
npm install express
```

--------------

**切换NPM镜像**

```shell script
# 管理员身份 打开cmd执行如下命令
npm install nrm -g
```

命令查看npm的仓库列表,带*的就是当前选中的镜像仓库

```shell script
nrm ls 
```

指定要使用的镜像源
```shell script
nrm use taobao
```

-----------

**cnpm的方式**


指定镜像仓库

```shell script
npm install -g cnpm --registry=https://registry.npm.taobao.org
```

查看cnpm的版本

```shell script
# 管理员身份 打开cmd执行如下命令
npm install nrm -g
```

查看cnpm的版本

```shell script
cnpm -v
```

下载的js库；一般只有在下载模块的时候才使用cnpm，其它情况还是一样使用npm

```shell script
cnpm install
```

--------------------

**Webpack安装**

全局安装

```shell script
npm install webpack -g
```

```shell script
npm install webpack-cli -g
```

查看版本号

```shell script
webpack -v
```


- [返回文件顶部](../README.md)


