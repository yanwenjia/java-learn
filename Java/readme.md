#### 注释
- 单行注释 `// 注释`
- 多行注释 `/* 注释 */`
- 文档注释 `/** 注释 */`
#### 常量
#### 数据类型
- 基本数据类型
    - 数值型
        - 整数（byte，short，int，long）
        - 浮点数（float，double）
        - 字符（char）
    - 非数值型
        - 布尔（boolean）
- 引用数据类型
    - 类型（class）
    - 接口（interface）
    - 数组（[] ）
#### 变量
- 格式：类型 变量名 = 值 `int a = 20`
- 注意事项：
    - 不能重复定义
    - 定义必须赋值
    - long 加L
    - float 加F
#### 标识符
#### 类型转换
- 自动类型转换
- 强制类型转换
#### 运算符
- 关系运算符
- 逻辑运算符
    - 与 `&`
    - 或 `|`
    - 非 `!`
    - 异成 `^` `a^b a和b结果相同为false，不同为true`
- 短路逻辑运算符
    - 短路与 `&&`
    - 短路或 `||`
- 三元运算符
#### 数据输入
- Scanner
```
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int = sc.nextInt()
```
#### 流程控制
- 顺序结构
- 分支机构
- 循环结构
#### random
```
import java.util.Random;
Random r = new Random()
int num = r.nextInt(10) // 0-10
```
#### 数组
- 数据类型[] 变量名
- 数据类型  变量名[]
- 索引越界
- 空指针异常
- java数组是{}表示
#### 方法
- 方法重载
    - 多个方法在同一个类中
    - 多个方法具有相同的方法名
    - 多个方法参数不相同：类型不同或者数量不同
#### 类和对象
- 类是生活中一类具有共同属性和行为的事物的抽象
- 对象是能够看得到摸得着的真是存在的实体
- private 权限修饰符
#### 基本类型-包装类
```
byte     Byte
short    Short
int      Integer
long     long
float    Float
double   Double
char     Character
boolean  Boolean
```
#### 自动装箱和拆箱
- 装箱：把基本数据类型转换为对应的包装类型
- 拆箱：把包装类型转换为对应的基本数据类型

#### 01
1. 创建一个maven项目
2. 加入maven的依赖
    - spring的依赖，版本5.2.5版本
    - junit依赖
3. 创建类（接口和他的实现类）
    - 和没有使用框架一样，就是普通的类
4. 创建spring需要使用的配置文件
    - 申明类的信息，这些类由spring创建和管理
    - 通过spring的语法，完成属性的赋值
5. 测试spring创建的对象
#### 02
- di：依赖注入，表示创建对象，给属性赋值
- di的实现语法有两种：
    1. 在spring的配置文件中，使用标签属性完成，叫做基于xml的di实现
    2. 使用spring中的注解，完成属性赋值。叫做基于注解的id实现
- di的语法分类
    1. set注入（设置注入）：spring调用类的set方法，在set方法可以实现属性的赋值
    2. 构造注入，spring调用类的有参数构造方法创建对象，在构造方法中完成赋值；
- 注解：
    - @component
    - @Respotory
    - @Service
    - @Controllor
    - @value
    - @Autowired
    - @Resource
#### 04 通过Spring的注解完成对Java对象的创建，属性，代替xml文件
- 步骤：
    - 1. 加入依赖
    - 2. 创建类，在类中加入注解
    - 3. 创建Spring的配置文件---申明组件扫描器的标签，指明注解在你的项目中的位置
    - 4. 使用注解创建对象，创建容器的applictionContext
##### 动态代理
#### aop
- 动态代理
    - jdk动态代理：目标类必须实现接口
    - cglib动态代理：第三方工具库
- 术语
    - Aspect切面：表示增强得功能，就是一堆代码，完成某一个功能，非业务功能
    - JoinPoint 连接点：链接业务方法和切面方法
    - Pointcut：切入点：多个连接点方法得集合
    - 目标对象
    - advice 通知：表示切面功能执行得时间
- 一个切面有三个关键得要素
    - 切面得功能代码，切面干什么
    - 切面得执行位置
    - 切面得执行时间，使用advice表示时间，在目标方法之前还是之后


