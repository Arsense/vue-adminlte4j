### [Quick Starter](../../wiki/Quick-Starter)

## 页面展示
### table展示
![](/doc/table.png)
### model 弹层展示
![](/doc/model.png)
### form 展示
![](/doc/form.png)

### 树形控件配置菜单栏
![](/doc/config.png)

##### 工程构建
依赖环境：node , webpack ； node安装 ， 自行搜索安装最新版本

前端基于webpack构建的 ， 所以需要先安装webpack

`npm install --save-dev webpack`

##### 构建前端库文件
```bash
cd src\main\static
npm i 
npm start
```

运行test 下面ApplicationStarter
访问地址 http://localhost:8080/index.html
#### 后台显示菜单栏
vmOptions里面添加:
`-Dadmin.src.dir=D:\codeExercise\vue-adminlte4j`
路径改为自己当前路径

执行maven打包 得到jar即可


vue-adminlte-java 后台界面库 
提供统一的布局 ， ui控件
天然前后台分离 ， 通过rest-api提供数据， 控件与java类库模型进行绑定
开发时可配置的控件



