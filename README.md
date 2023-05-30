# **Втора лабораториска вежнба по Софтверско инженерство**

## **Никола Торбовски, бр. на индекс 151200**

### **Control Flow Graph**

![Control Flow Diagram (CFG)](./Static/Control%20Flow%20Diagram%20(CFG).png)

### **Цикломатска комплексност**

Цикломатската комплексност на овој код е 11. Истата ја добив преку формулата V(G) = P+1, каде P е бројот на предикатни јазли, каде во случајов P = 10, па V(G) = P+1 = 11. Исто така може да се дојде до истиот резултат ако се употреби формулата V(G) = E-N+2, каде E претставува бројот на рабови, a N претставува бројот на јазли во грфот. Па така според формулата V(G) = 31-22+2 = 11.

### **Тест случаи според критериумот Every Branch**

|C1|user = NULL, allUsers = NULL|user = User(username := NULL, password := "test.test", email := "test.test@mail.com)", allUsers = List(User(username := "test.test@mail.com"), password := ANY, email := "test.test@mail.com"))|user = User(username := "hello", password := "1 3456789", email := "test@mail.com"), allUsers = NULL|user = User(username := "hello", password := "1 3456789", email := "test@mail.com"), allUsers = NULL|
|:----|:----|:----|:----|:----|
|36 -> 37|*| | | |
|36 -> 40| |*|*|*|
|40 -> 41| |*| | |
|40 -> 44, 45| | |*|*|
|44, 45 -> 46, 47.1| |*| | |
|44, 45 -> 58, 59, 60, 62| | |*|*|
|47.2 -> 48, 49| |*| | |
|47.2 -> 58, 59, 60, 62| |*| | |
|48, 49 -> 50| |*| | |
|48, 49 -> 52| | | | |
|52 -> 53| |*| | |
|52 -> 47.3| | | | |
|58, 59, 60, 62 -> 63| |*| | |
|58, 59, 60, 62 -> 66| | |*|*|
|66 -> 67.1| | |*|*|
|66 -> 74| | | | |
|67.2 -> 68| | |*|*|
|67.2 -> 74| | |*|*|
|68 -> 69| | |*| |
|68 -> 67.3| | | |*|

### **Тест случаеви според критериум Multiple Condition**

| user==null \|\| user.getPassword()==null \|\| user.getEmail()==null ||
| :---- | :---- |
| TXX | user = NULL |
| FTX | user = User (username := ANY| password := NULL | email := ANY) |
| FFT | user = User (username := ANY| password := "123" | email := NULL) |
| FFF | user = User (username := ANY | password := "123" | email := "test@mail.com") |
