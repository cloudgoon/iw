# iw &nbsp;web 快速开发，基础功能集成底层
<br/>
整合权限、论坛、会员、日志、消息、系统、数据缓存、短信等功能
<br/>Spring4、Spring MVC4、Hibernate4、Shiro、<a href="http://github.com/xnx3/xnx3" target="_black">xnx3-2.2</a>

##[快速搭建项目运行Demo，下载后导入运行](https://github.com/xnx3/iw_demo)
##快速开发代码示例
* 列表分页
	* [单数据表、分页示例](http://www.xnx3.com/software/iw/20160527/946.html)
	* [单数据表、搜索、分页示例](http://www.xnx3.com/software/iw/20160527/947.html)
	* [单数据表、搜索、排序、分页示例](http://www.xnx3.com/software/iw/20160524/944.html)
	* [多表查询、搜索、排序、分页示例](http://www.xnx3.com/software/iw/20160527/949.html)
	* [多数据表联合查询、搜索、排序、状态码js缓存](http://www.xnx3.com/software/iw/20160527/950.html)
* 日志
	* [添加日志示例](http://www.xnx3.com/software/iw/20160527/951.html)
	* [DOC文档](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/LogService.html)
* OSS文件上传
	* [文件上传示例](http://www.xnx3.com/software/iw/20160601/952.html)
	* [DOC文档](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/OSSService.html)
* 多语言支持
	* [中文、英文、...添加减少语言种类自由配置](http://www.xnx3.com/software/iw/20160623/953.html)
	* [DOC文档](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/LanguageService.html)
* 数据库操作
	* [事务](http://www.xnx3.com/software/iw/20160628/954.html)
	* [乐观锁](http://www.xnx3.com/software/iw/20160628/955.html)
* 论坛相关
	* [板块](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/PostClassService.html)
	* [帖子](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/PostService.html)
	* [评论](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/PostCommentService.html)
* [手机验证](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/SmsLogService.html)
* [Sql操作](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/SqlService.html)	
* [用户操作](http://www.xnx3.com/software/iw/doc/com/xnx3/j2ee/service/UserService.html)


<br/>
<br/>

## 目录说明
* /src								java源代码<br/>
* /src/com/xnx3/j2ee/bean			相关bean类<br/>
* /src/com/xnx3/j2ee/controller		springmvc控制器<br/>
* /src/com/xnx3/j2ee/controller/admin管理后台<br/>
* /src/com/xnx3/j2ee/dao			数据库相关操作<br/>
* /src/com/xnx3/j2ee/entity			数据库关联的实体类<br/>
* /src/com/xnx3/j2ee/generateCache	程序数据的缓存文件生成<br/>
* /src/com/xnx3/j2ee/interceptor		springmvc拦截器<br/>
* /src/com/xnx3/j2ee/service			service层<br/>
* /src/com/xnx3/j2ee/service/impl		service层的实现<br/>
* /src/com/xnx3/j2ee/servlet			servlet<br/>
* /src/com/xnx3/j2ee/shiro			shiro权限<br/>
* /src/com/xnx3/j2ee/tld				自定义标签<br/>
* /src/com/xnx3/j2ee/util			工具类<br/>
* /src/com/xnx3/j2ee/vo				json返回使用<br/>

/*.do 、 /*.jsp 、 /*.html  根目录下的do/html/jsp页面可以直接访问，无需登陆<br/>
com.xnx3.j2ee.Global						基础配置、集中管理。全局控制，全局的参数、常亮，都是在这里<br/>
com.xnx3.j2ee.Global.get("systemName");	直接调用system表配置的值<br/>
src/systemConfig.xml						系统某些实用功能的配置文件所在<br/>
<br/>


