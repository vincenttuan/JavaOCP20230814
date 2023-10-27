# JavaOCP20230814
JavaOCP20230814

# MySQL 匯出指令: 
mysqldump -u root -p demo > demo_backup.sql

# MySQL 匯入指令: 
mysql -u root -p demo < demo_backup.sql

<pre>
CREATE VIEW `sales_view` AS
SELECT 
	s.no, s.date, s.qty, s.product_id, s.branch_id,
    p.name as product_name, p.price,
    b.name as branch_name, b.city_id,
    c.name
FROM 
	demo.sales s, demo.products p, demo.branches b, demo.cities c
WHERE
	s.product_id = p.id AND 
    s.branch_id = b.id AND
    b.city_id = c.id

SELECT 
    s.no, s.date, s.qty, s.product_id, s.branch_id,
    p.name as product_name, p.price,
    b.name as branch_name, b.city_id,
    c.name as city_name
FROM 
    demo.sales s
JOIN demo.products p ON s.product_id = p.id
JOIN demo.branches b ON s.branch_id = b.id
JOIN demo.cities c ON b.city_id = c.id    

</pre>
