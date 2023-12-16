class Person:
    def __init__(self, name, num, date):
        self.name = name
        self.num = num
        self.date = date
    
    def __str__(self):
        return '{}: {} {}'.format(self.name, self.num, self.date)

f = open("SOTAY.txt", 'r')
f1 = open("DIENTHOAI.txt", 'w')

data = []
for i in f:
    data.append(i[:-1])
a = []
i = 0
while i < len(data):
    s = data[i].split()
    if s[0] == 'Ngay':
        i += 1
        while True:
            x = Person(data[i], data[i+1], s[1])
            a.append(x)
            i += 2
            if i > len(data) - 1:
                break
            x = data[i].split()
            if x[0] == 'Ngay':
                break

for i in a:
    print(i)
    f1.write(str(i) + '\n')
f.close()
f1.close()