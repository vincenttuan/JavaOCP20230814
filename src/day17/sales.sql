use demo;

-- 建立 products
create table if not exists products(
	id int auto_increment primary key,
    name varchar(50) not null,
    price int not null
);

-- 建立 cities
create table if not exists cities(
	id int auto_increment primary key,
    name varchar(50) not null unique
);

-- 建立 branches
create table if not exists branches(
	id int auto_increment primary key,
    name varchar(50) not null,
    city_id int,
    constraint fk_branch_city foreign key (city_id) references cities(id)
);

-- 建立 sales
create table if not exists sales(
	no varchar(10) primary key,
    date date not null,
    qty int not null,
    product_id int,
    branch_id int,
    constraint fk_sale_product foreign key (product_id) references products(id),
    constraint fk_sale_branch foreign key (branch_id) references branches(id)
);