#### 一、数据库的设计的一些想法：
- 1、主键全部采用与业务无关的自增来实现
    - 自增主键：高效简单
    - 占用位数少，索引位数同样少
    - 易排序
- 2、时间的选择上(依据特性选择)：
     - timestamp：
        - 自动赋值，自动更新；timestamp on update current_timestamp(创建的时候为0，更新以更新时间为准)
        - 占用位数少
        - 与时区相关
        - 5.6之前表中有多个timestamp只有一个可以自动更新
     - datetime：
        - 占用8位，
        - 与时区无关   