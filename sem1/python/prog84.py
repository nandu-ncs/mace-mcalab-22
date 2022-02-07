import csv
try:
    with open('csv1.csv') as inf:
        content=csv.reader(inf,delimiter=',')
        count=0
        for row in content:
            if count==0:
                print(f'Column names : {", ".join(row)}')
                col=int(input('Enter column header number : '))
                count=1
            else:
                print(row[col-1])
except Exception as e:
    print(e)