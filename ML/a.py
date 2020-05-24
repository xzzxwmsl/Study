from xlutils.copy import copy
import xlwt
import xlrd
url = 'C:\\Users\\xzz\\Desktop\\2.xlsx'
data = xlrd.open_workbook(url)
s1 = data.sheet_by_name('Sheet1')
dict_phone = {'null': '11111111111'}
print(s1.cell_value(2, 1))
print(s1.cell_value(63, 1))
for i in range(2, 64):
    dict_phone[s1.cell_value(i, 1)] = str(s1.cell_value(i, 8))
print(dict_phone.get('陈佳梦'))
print(type(dict_phone.get('陈佳梦')))

###############

# 打开想要更改的excel文件
old_excel = xlrd.open_workbook(
    'C:\\Users\\xzz\\Desktop\\1.xlsx')
# 将操作文件对象拷贝，变成可写的workbook对象
new_excel = copy(old_excel)
# 获得第一个sheet的对象
ws = new_excel.get_sheet(0)
s2 = old_excel.sheet_by_name('Sheet1')
# 写入数据
for i in range(3, 103):
    if s2.cell_value(i, 2) in dict_phone:
        print(s2.cell_value(i, 2), dict_phone.get(s2.cell_value(i, 2)))
        ws.write(i,8,dict_phone.get(s2.cell_value(i, 2)))
# 另存为excel文件，并将文件命名
new_excel.save('C:\\Users\\xzz\\Desktop\\12.xlsx')
