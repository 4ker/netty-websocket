# netty-websocket

## launch

At first, java 8 should be supported in your server.

Run `net.mengkang.WebSocketServer` in IDE, Then you can open the `client.html` in your browser for testing.

## benchmark

you can use the script `banchmark.py` in command line.

---

## 笔记

比如你要 redis 的支持，用 jdeis：[xetorthio/jedis: A blazingly small and sane redis java client](https://github.com/xetorthio/jedis)，
然后把

```xml
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>2.8.1</version>
    <type>jar</type>
    <scope>compile</scope>
</dependency>
```

添加到 pom.xml，然后 import（IntelliJ IDEA 会提示你）。
然后就可以测试了（新建一个 class，在 main 函数里添加代码）：

```java
Jedis jedis = new Jedis("localhost");
jedis.set("foo", "bar");
String value = jedis.get("foo");
System.out.println(value);
```

按 `Alt-Enter` 就可以引入 import 语句：`import redis.clients.jedis.Jedis;`。
