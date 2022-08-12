# hdu_shop

前台商城系统+后台管理系统

前端效果演示界面请访问码云[链接](https://gitee.com/lxz1234/hdu-mall)

## 项目介绍

**简介**: 前台商城系统包含首页门户、商品推荐、商品搜索、商品展示、购物车、订单流程、会员中心、客户服务等模块。后台管理系统包含商品管理、订单管理、会员管理、促销管理、内容管理、权限管理等模块。

 **责任描述**:

● 与前端人员共同编写接口文档。

● 独立开发的基于SpringBoot+MyBatis的电商平台，采用前后端分离架构。

● 采用SpringSecurity和JWT实现了后台用户的登录和授权功能。

● 采用Redis实现了高频信息缓存，加快了请求响应速度。

● 采用Elasticsearch实现商品信息的导入、查询、修改、删除功能。

● 采用MongoDB实现商品浏览记录的添加、删除、查询功能。

● 采用RabbitMQ发送延迟消息取消超时订单。

● 整合了阿里云对象存储服务实现文件上传的过程，采用服务端签名后前端直传的方式。

## 项目演示

### hdu_shop后台系统

项目演示地址: https://gitee.com/lxz1234/hdu-mall
(动图可能看不了,请点击上方链接查看)
<img src="D:\webProject\mall\项目文档\backend1.gif" alt="backend1" style="zoom:200%;" />



<img src="D:\webProject\mall\项目文档\backend3.gif" alt="backend3" style="zoom:200%;" />



### 前台商城系统

项目演示地址: https://gitee.com/lxz1234/hdu-mall
(动图可能看不了,请点击上方链接查看)
<img src="D:\webProject\mall\项目文档\front1.gif" alt="front1" style="zoom:200%;" />



<img src="D:\webProject\mall\项目文档\front2.gif" alt="front2" style="zoom:200%;" />



## 组织结构

```
hdu_shop
├── common -- 工具类及通用代码
├── mbg -- MyBatisGenerator生成的数据库操作代码
├── security -- SpringSecurity封装公用模块
├── admin -- 后台商城管理系统接口
├── search -- 基于Elasticsearch的商品搜索系统
├── portal -- 前台商城系统接口
```

## 技术栈

| 技术                 | 说明           | 官网                                                |
| -------------------- | -------------- | --------------------------------------------------- |
| SpringBoot           | 容器+MVC框架   | https://spring.io/projects/spring-boot              |
| SpringSecurity       | 认证和授权框架 | https://spring.io/projects/spring-security          |
| MyBatis              | ORM框架        | http://www.mybatis.org/mybatis-3/zh/index.html      |
| MyBatisGenerator     | 数据层代码生成 | http://www.mybatis.org/generator/index.html         |
| Elasticsearch        | 搜索引擎       | https://github.com/elastic/elasticsearch            |
| RabbitMQ             | 消息队列       | https://www.rabbitmq.com/                           |
| Redis                | 分布式缓存     | https://redis.io/                                   |
| MongoDB              | NoSql数据库    | [https://www.mongodb.com](https://www.mongodb.com/) |
| JWT                  | JWT登录支持    | https://github.com/jwtk/jjwt                        |
| Swagger-UI           | 文档生成工具   | https://github.com/swagger-api/swagger-ui           |
| Hibernator-Validator | 验证框架       | http://hibernate.org/validato                       |

## 业务架构图

![业务架构图](https://user-images.githubusercontent.com/109453006/184355071-09c31875-5332-45dd-80ac-e3f747e8ad03.png)
