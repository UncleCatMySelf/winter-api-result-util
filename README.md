# winter-api-util

A toolkit to facilitate spring boot development of the Restful API

## Apache Maven

```
<dependency>
  <groupId>com.github.UncleCatMySelf</groupId>
  <artifactId>winter-api-util</artifactId>
  <version>2.1.0</version>
</dependency>
```

## How to use

We offer the return class and return tool classes developed by the traditional restful API.

Here is a demo

```java

@org.springframework.beans.factory.annotation.Autowired
private ResultVOUtil resultVOUtil;

@PostMapping("/send")
public ResultVo send(@RequestParam String name,@RequestParam String msg){
    Channel channel = (Channel) redisTemplate.getChannel(name);
    if (channel == null){
        return resultVOUtil.error(555,"当前用户连接已断开");
    }
    String result = SendUtil.sendTest(msg,channel);
    return resultVOUtil.success(result);
}
```

You can use ResultVo and ResultVOUtil, For Resultvoutil, you can inject it directly.

## Author

QQ group：628793702

![Image text](https://raw.githubusercontent.com/UncleCatMySelf/img-myself/master/img/%E5%85%AC%E4%BC%97%E5%8F%B7.png)

