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

在SQL中，執行計畫是描述資料庫管理系統如何運行特定查詢的重要工具。為了獲得查詢的執行計畫，您需要使用 EXPLAIN 關鍵字。以下是如何使用的範例：
EXPLAIN SELECT 
    s.no, s.date, s.qty, s.product_id, s.branch_id,
    p.name as product_name, p.price,
    b.name as branch_name, b.city_id,
    c.name as city_name
FROM 
    demo.sales s
LEFT JOIN demo.products p ON s.product_id = p.id
LEFT JOIN demo.branches b ON s.branch_id = b.id
LEFT JOIN demo.cities c ON b.city_id = c.id;

當您運行帶有 EXPLAIN 的查詢時，它不會真的執行查詢，而是返回一個報告，顯示了伺服器是如何處理SQL查詢的。這通常包括：

id：這是MySQL為執行計畫中的每個操作分配的標識符。
select_type：表示查詢的類型（例如 SIMPLE, SUBQUERY, DERIVED 等）。
table：顯示正在使用的表格名稱。
partitions：顯示查詢將影響哪些分區（如果使用的話）。
type：表示連接的類型，是分析查詢性能的重要關鍵。它可以是 system, const, eq_ref, ref, fulltext, ref_or_null, index_merge, unique_subquery, index_subquery, range, index, ALL 等之一。
possible_keys：列出MySQL可能選擇用於查詢的鍵（索引）。
key：MySQL選擇用於查詢的實際鍵（索引）。如果沒有選擇索引，則為NULL。
key_len：顯示所使用鍵的長度。在某些情況下，MySQL不會使用整個索引，而只使用部分。
ref：顯示哪些列或常量被用來在索引中查找值。
rows：顯示MySQL估計必須檢查的行數，這基於表的統計信息和索引選擇。
filtered：表示根據表的條件過濾後剩餘的行的百分比。
Extra：提供額外信息，例如是否使用了索引，是否有文件排序等。
通過理解 EXPLAIN 輸出，您可以分析查詢性能並找出可能的瓶頸。例如，全表掃描（在 "type" 列中顯示為 "ALL"）通常表示查詢效率可能不是很好，特別是在大型表格中。

請注意，解釋執行計畫和進行查詢優化通常需要深入了解資料庫的內部工作，這可能需要資料庫管理員或具有相關知識的人員。
	
</pre>
