-- 코드를 입력하세요
SELECT animal_id, name, DATE_FORMAT(DATETIME, '%Y-%m-%d')
FROM animal_ins
ORDER BY animal_id asc