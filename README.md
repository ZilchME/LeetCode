# 算法练习

力扣使用核心代码模式：在 `Solution` 中实现题目指定方法，由 JUnit 直接传参并断言结果。ACM 题保留 `Main` 和标准输入输出。

## 目录约定

```text
src/main/java/edu/csu/
├── leetcode/
│   ├── problems/
│   │   ├── hot100/p0394/
│   │   ├── classic150/p0076/
│   │   ├── middle/p0077/
│   │   └── hard/p0772/
│   │       ├── problems.md  # 题面、示例、约束
│   │       └── Solution.java # 核心方法
│   └── utils/               # ListNode 等公共结构
└── acm/                     # 标准输入输出模式练习
src/test/
├── java/edu/csu/leetcode/problems/hard/p0772/SolutionTest.java
└── resources/               # 新增的大型测试输入或预期结果
```

新题先按原有类别归档（`hot100`、`classic150`、`middle`、`hard`），再按题号建立包：`p` + 至少四位数字，例如 `p0076`、`p0772`。类名统一为 `Solution`，测试包与源代码包一致。测试包与源码使用相同的“类别 + 题号”结构；测试数据也按类别和题号归档。额外标签可写在题面中。

## 编写与运行

1. 在对应类别下创建题号目录，放入 `problems.md` 和 `Solution.java`，保留题目原始函数签名。
2. 在对应测试目录创建 `SolutionTest.java`。直接调用方法，不需要读取控制台输入或编写 `main`。
3. 用 `assertEquals` 比较普通返回值，用 `assertArrayEquals` 比较数组；数组原地修改题同时检查返回长度和有效前缀。无序结果应先规范化再比较。
4. 先覆盖官方示例，再覆盖边界条件和题目特有规则。每个测试创建新的 `Solution`；可变输入也重新创建，避免测试互相影响。
5. 在 IDEA 中右键测试类运行或调试；断言失败时查看预期值和实际值，在核心方法中打断点。

772 已提供题面、未实现的方法和断言测试，没有解法。测试暂用 `@Ignore` 标记；准备开始练习时删除该注解，运行测试观察失败，再实现方法直到通过。被跳过的测试不代表题目已完成。

## 命令行测试

需要 JDK 24 或更新版本及 Maven。保留项目原有 Java 24 编译级别，统一配置来源，并固定 JUnit 为 4.13.2，以兼容已有测试。

```sh
# 运行一道题；使用完整类名，避免多个 SolutionTest 重名
mvn -Dtest=edu.csu.leetcode.problems.hard.p0772.SolutionTest test

# 运行已有的单个练习
mvn -Dtest=edu.csu.leetcode.problems.hot100.p0394.SolutionTest test

# 运行所有力扣测试
mvn test
```

默认 Maven 只编译 `edu/csu/leetcode` 中的核心代码，ACM 练习在 IDEA 中单独运行相应 `Main`。这样 ACM 中的输入文件、临时练习代码不会影响力扣测试。修改编译范围后可运行一次 `mvn clean test` 清除旧产物。

历史测试中有些仅打印结果，应逐步改为断言；当前全量测试成功不等于所有历史答案都已经验证正确。大型用例统一放到 `src/test/resources`，通过类路径读取，避免依赖运行目录。

## 提交力扣

复制 `Solution.java` 中的类和必要的 import，移除 `package` 声明。不要复制测试类；链表、树等题使用平台提供的结构定义。未实现模板使用抛出异常占位，避免返回默认值造成误判。

## 题目索引

| 题号 | 题目 | 分类 |
| --- | --- | --- |
| 30 | [串联所有单词的子串](src/main/java/edu/csu/leetcode/problems/classic150/p0030/problems.md) | classic150 |
| 32 | [最长有效括号](src/main/java/edu/csu/leetcode/problems/hot100/p0032/problems.md) | hot100 |
| 39 | [组合总和](src/main/java/edu/csu/leetcode/problems/hot100/p0039/problems.md) | hot100 |
| 51 | [N 皇后](src/main/java/edu/csu/leetcode/problems/hot100/p0051/problems.md) | hot100 |
| 76 | [最小覆盖子串](src/main/java/edu/csu/leetcode/problems/classic150/p0076/problems.md) | classic150 |
| 77 | [组合](src/main/java/edu/csu/leetcode/problems/middle/p0077/problems.md) | middle |
| 79 | [单词搜索](src/main/java/edu/csu/leetcode/problems/hot100/p0079/problems.md) | hot100 |
| 80 | [删除有序数组中的重复项 II](src/main/java/edu/csu/leetcode/problems/classic150/p0080/problems.md) | classic150 |
| 139 | [单词拆分](src/main/java/edu/csu/leetcode/problems/hot100/p0139/problems.md) | hot100 |
| 394 | [字符串解码](src/main/java/edu/csu/leetcode/problems/hot100/p0394/problems.md) | hot100 |
| 772 | [基本计算器 III](src/main/java/edu/csu/leetcode/problems/hard/p0772/problems.md) | hard，待实现 |
| 自定义 | [两种商品恰好用完预算的方案数](src/main/java/edu/csu/leetcode/problems/middle/purchasePlans/problems.md) | middle，完全背包 |

没有力扣题号的自定义题，在对应分类下使用描述性目录名，例如 `middle/purchasePlans`。

第 30 题的代码原来误放在 `MinimumWindowSubstring76` 下，现已单独归位。该旧目录的题面和示例数据属于第 76 题，分别迁移至 `p0076` 及 `src/test/resources/leetcode/classic150/p0076`，数据内容原样保留。其余缺失题面仅记录方法签名，未自动补写解法或完整题面。
