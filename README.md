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

分析
    继续使用kafka
        如何规整kafka中数据
        数据要求是什么
    不使用kafka
        如何改造端到端流程![image](https://github.com/user-attachments/assets/eae33683-de40-4663-b133-21c82973480a)


是要要考虑sqlite的单文件拆成多文件然后多线程写多个表，其实不用，只要能打满磁盘写IO即可

sqlite的定位是啥：DSL关联查询+组装数据？ 排序？ 

是否要讲sqlite排序的数据 再次生成csv？  --可以，上传到minio
