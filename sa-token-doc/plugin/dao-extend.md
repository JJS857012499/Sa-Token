# 持久层扩展
--- 

对于权限框架来讲，最容易碰到的扩展点便是数据存储方式，为了方便对接不同的缓存中间件，Sa-Token将所有数据持久化操作抽象到SaTokenDao接口，
开发者要对接不同的平台只需要实现此接口即可，接口签名：[SaTokenDao.java](https://gitee.com/dromara/sa-token/blob/master/sa-token-core/src/main/java/cn/dev33/satoken/dao/SaTokenDao.java)
 
框架已提供的集成包包括：

- 默认方式：储存在内存中，位于core核心包。
- sa-token-redis：Redis集成包，使用 jdk 默认序列化方式。
- sa-token-redis-jackson：Redis集成包，使用 jackson 序列化方式。
- sa-token-redisx：Redisx 集成包。 
- sa-token-redis-fastjson：Redis集成包，使用 fastjson 序列化方式。
- sa-token-redis-fastjson2：Redis集成包，使用 fastjson2 序列化方式。
- sa-token-redisson-jackson：Redis集成包，Redisson客户端使用，jackson 序列化方式。
- sa-token-redisson-jackson2：通用 redisson 集成方案 （spring, solon, jfinal 等都可用）。
- sa-token-hutool-timed-cache：集成 hutool 框架的 Timed-Cache 缓存方案（基于内存）。

有关 Redis 集成，详细参考：[集成Redis](/up/integ-redis)，更多存储方式欢迎提交PR 


**扩展：集成 MongoDB**

- [集成 MongoDB 参考一](/up/integ-spring-mongod-1)
- [集成 MongoDB 参考二](/up/integ-spring-mongod-2)





