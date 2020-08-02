##创建用户表
create table t_user (
    user_id bigint(20) auto_increment not null comment '用户id',
    user_open_id varchar(255) not null comment '用户的唯一标识',
    user_nickname varchar(20) not null comment '用户昵称',
    user_sex tinyint not null comment '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
    user_province varchar(20) not null comment '用户个人资料填写的省份',
    user_country varchar(20) not null comment '国家，如中国为CN',
    user_headimgurl varchar(255) not null comment '用户头像',
    user_email varchar(30) not null comment '用户邮箱',
    user_email_status tinyint not null comment '用户邮箱验证状态(1=验证,0=未验证)',
    user_last_ip varchar(20) not null comment '用户ip',
    user_last_login_time timestamp not null comment '用户最近登录',
    user_gmt_create datetime not null default current_timestamp comment '用户创建时间',
    user_gmt_modified datetime not null default current_timestamp on update current_timestamp comment '用户更新时间',
    primary key (user_id, user_open_id)
) engine = innodb charset = utf8 comment = '用户表';

##创建博文表
create table t_articles (
    article_id bigint(255) auto_increment not null comment '博文id',
    user_id bigint(20) not null comment '用户id',
    article_title text not null comment '博文标题',
    article_content longtext not null comment '博文内容',
    article_views bigint not null  comment '浏览量',
    article_comment_count bigint(20) not null comment '评论总数',
    article_like_count bigint(20) not null comment '点赞数',
    article_gmt_create datetime not null default current_timestamp comment '博文创建时间',
    article_gmt_modified datetime not null default current_timestamp on update current_timestamp comment '博文更新时间',
    primary key (article_id),
    foreign key (user_id) references t_user(user_id)
) engine = innodb charset = utf8 comment = '博文表';

##创建评论表
create table t_comments (
    comment_id bigint(20) auto_increment not null comment '评论id',
    user_id bigint(20) not null comment '用户id',
    article_id bigint(20) not null comment '博文id',
    comment_like_count bigint(20) not null comment '点赞数',
    comment_content text not null comment '评论内容',
    parent_comment_id bigint(20) comment '父评论id',
    comment_gmt_create datetime not null default current_timestamp comment '评论创建时间',
    comment_gmt_modified datetime not null default current_timestamp on update current_timestamp comment '评论更新时间',
    primary key (comment_id),
    foreign key (user_id) references t_user(user_id),
    foreign key (article_id) references t_articles(article_id)
) engine = innodb charset = utf8 comment = '评论表';

##创建标签表
create table t_labels (
    label_id bigint(20) auto_increment not null comment '标签id',
    label_name varchar(20) not null comment '标签名称',
    label_description text not null comment '标签描述',
    label_gmt_create datetime not null default current_timestamp comment '标签创建时间',
    label_gmt_modified datetime not null default current_timestamp on update current_timestamp comment '标签更新时间',
    primary key (label_id)
) engine = innodb charset = utf8 comment = '标签表';

##创建博文标签表
create table t_article_label (
    article_id bigint(255) not null  comment '博文id',
    label_id bigint(20) not null comment '标签id',
    article_label_gmt_create datetime not null default current_timestamp comment '博文标签创建时间',
    article_label_gmt_modified datetime not null default current_timestamp on update current_timestamp comment '博文标签更新时间',
    primary key (article_id, label_id),
    foreign key (article_id) references t_articles(article_id),
    foreign key (label_id) references t_labels(label_id)
) engine = innodb charset = utf8 comment = '博文标签表';