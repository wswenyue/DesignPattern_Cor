# 设计模式之责任链模式
###什么是责任链模式？

在责任链模式中，作为请求接受者的多个对象通过对其后继的引用
而连接起来形成一条链。请求在这条链上传递，直到链上某一个接
受者处理这个请求。每个接受者都可以选择自行处理请求或者是向
后继传递请求。

###责任链模式示例-->客户-销售系统

![责任链模式](http://7xj2yt.com1.z0.glb.clouddn.com/责任链模式例子.png)


###优点：解耦
发出请求的客户端并不知道链上的哪一个接收者会处理这个请求，
从而实现了客户端和接收者之间的解耦。

###优点符合开闭原则：
扩张开放
变更关闭

###缺点：性能有待考究（javaAWT早期团队使用责任链，后来用观察者模式替代）
时间：遍历整个链条的时间成本很高
内存：创建了大量对象，只是用来传递信息

### 应用场景
- javaScript Event Model
- java 的异常处理机制
- javaEE FilterChain 拦截器（不是纯责任链）


### 学习设计模式的一点感触
理解模式如何让我们应对变化，如何用一种抽象的方法编程
