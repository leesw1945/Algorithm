-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, 
COALESCE(freezer_yn, 'N')
FROM food_warehouse
WHERE warehouse_name like '%경기%'
ORDER BY warehouse_id asc