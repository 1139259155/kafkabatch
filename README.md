# kafkabatch

目标: 
+ 按5条从csv中读取数据
+ 将数据按类型在内存中累积
+ 将数据按类型写入磁盘
+ 从磁盘读取数据按key hash分块
+ 将分块数据写入磁盘
+ 将新旧分块数据对比
+ 将对比数据写入磁盘
+ 将新分块数据归档至旧数据

技术栈:
dataframe
dflib
jtablesaw