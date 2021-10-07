CREATE DATABASE IF NOT EXISTS `blog` DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

create table if not exists `t_user`(
    `id` bigint auto_increment,
    `name` varchar(100) not null comment '用户名称',
    `password` varchar(100) not null comment '用户密码',
    `created_time` datetime  comment '创建时间',
    `updated_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `t_repo`(
    `id` bigint auto_increment,
    `user_id` bigint not null comment '作者',
    `name` varchar(100) not null comment 'repo 名字',
    `is_visible` int default 0 comment '是否可见， 0 不可见， 1 可见',
    `created_time` datetime  comment '创建时间',
    `updated_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table if not exists `t_post`(
    `id` bigint auto_increment,
    `user_id` bigint not null comment '作者',
    `repo_id` bigint not null comment '所属的 repo ID',
    `name` varchar(100) not null comment '文章名称',
    `body` text not null comment '用户密码',
    `created_time` datetime  comment '创建时间',
    `updated_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `t_comment`(
    `id` bigint auto_increment,
    `user_name` varchar(100) not null comment '评论人的姓名',
    `email` varchar(100) not null comment '联系邮箱',
    `comment_content` text not null comment '评论内容',
    `created_time` datetime  comment '创建时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;