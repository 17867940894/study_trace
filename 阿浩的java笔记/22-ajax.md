### AJAX

#### 1.1 概念

> Asynchronous JavaScript And Xml ，异步的js和xml
>
> 同步：客户端向服务器发送请求后，客户端必须等待服务器的响应，只有在客户端接收到了服务器的响应之后，客户端才能执行其他操作
>
> 异步：客户端向服务器发送请求后，客户端不需要等待服务器的响应就可以继续执行其他操作
>
> 作用：异步请求，局部刷新
>
> 好处：ajax是一种无需提交（加载）整个页面，就可以更新页面中部分内容的技术，提高了用户体验

#### 1.2 开发步骤

> 1. 创建执行异步请求的核心对象`XMLHttpRequest`
>
>    ```js
>    // 创建执行异步请求的核心对象`XMLHttpRequest`
>    var xmlHttp;
>    if(window.XMLHttpRequest){
>        // true，说明当前浏览器是高版本的浏览器，Chrome、Firefox、IE7+，内置了XMLHttpRequest
>        xmlHttp = new XMLHttpRequest();
>    }else{
>        // false，说明当前浏览器是老版本的浏览器，没有内置XMLHttpRequest，需要手动创建
>        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
>    }
>    ```
>
> 2. 建立连接
>
>    ```js
>    xmlHttp.open(参数1,参数2,参数3);
>    /*
>    参数1：提交方式：get、post
>    参数2：请求的地址
>    参数3：是否使用异步：true（异步）、false（同步）
>    */
>    ```
>
> 3. 发送请求
>
>    ```js
>    xmlHttp.send();
>    ```
>
>    注：
>
>    1. get请求：提交的数据必须拼接在请求的地址之后，并且send()方法的参数必须为空
>
>    2. post请求：提交的数据要写在send()方法的参数中，并且在调用send()方法之前必须添加
>
>       ```js
>       xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
>       ```
>
> 4. 接收服务器响应回来的数据
>
>    ```p
>    xmlHttp.onreadystatechange = function(){
>        if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
>            
>        }
>    }
>    ```
>
>    































