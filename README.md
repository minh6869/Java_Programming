# Java_Programming

Đây là repo chứa phần code thầy hướng dẫn mình làm sau mỗi buổi học. Mọi người lên đây để theo dõi. Xin cảm ơn!
Đây là hướng dẫn trên Windows có thể sẽ có một số bước không đúng với Mac hay Linux hoặc đơn giản mọi người chỉ muốn tải source thì có thể vào phần realses để tải

## Cài đặt Git

- Link download : [Git for Win](https://git-scm.com/downloads/win)

Kiểm tra cài đặt
 ```
 git --version 
 ```

![image](https://github.com/user-attachments/assets/00a14e02-415d-4431-8417-c67808cf0ea4)


trong trường hợp không hiện thì edit environment 


![image](https://github.com/user-attachments/assets/1f306f8d-4ebf-4cd8-9e74-2d0841bd673f)

Sau đó chọn Environment VariaEditEdit

Tích chọn phần Path trong System Varialbes và Edit


![image](https://github.com/user-attachments/assets/214f3380-4cf4-475e-a4f6-365faaa304a2)

mình thường chọn System vì đây là máy cá nhân có 1 user=)



![image](https://github.com/user-attachments/assets/f0018942-92d1-417f-9a11-6c90455dc743)


## Cài đặt Terminal cho Netbeans

Chọn Tool -> Open in Terminal

![image](https://github.com/user-attachments/assets/9175baba-8a93-4b78-8cd1-6693f451979f)

- Link download cygwin : https://www.cygwin.com/install.html



![image](https://github.com/user-attachments/assets/492f453a-55d9-4dc9-b5b8-020dde3dddf1)


tới bước này hãy thử chọn một site để down về là được, chọn cái nào cũng được, nếu tải chậm hãy thử site khác 
![image](https://github.com/user-attachments/assets/6b74018a-2faf-4b21-8444-0872cb9cc4e9)

Quá trình cài đặt cũng không có gì khó, vì cài cái này cũng chỉ để chạy git trên NetBeans nên cũng chỉ cần các package cơ bản của cygwin nên trong quá trình cài cũng chỉ next next next và finish...

Sau khi cài xong khởi động lại NetBeans
Open in Terminal trong Tool thì được kết quả:

 
![image](https://github.com/user-attachments/assets/e0cf21f1-bde1-4e45-9d72-5f4142c6feb9)



## Clone repo

Sau khi cài xong thì clone repo này về

![image](https://github.com/user-attachments/assets/dbe7ac8d-26ee-4277-96c4-b0b4b29ad63e)


paste vào url

```
https://github.com/minh6869/Java_Programming.git
```

![image](https://github.com/user-attachments/assets/505852e7-4d45-4be4-b331-1537b1cad15f)


ở đây mình clone về ổ D

sau đó chọn nhánh để remote

![image](https://github.com/user-attachments/assets/f3500188-c748-4bbe-9f8d-568e61aea352)

mỗi nhánh mình để trong repo là source ngày hôm đấy,
còn nhánh main mình để mỗi file readme này nên không cần tích vào,
nếu lỡ tích vào thì cũng không ảnh hưởng gì.

Sau đó next

![image](https://github.com/user-attachments/assets/077e9bac-eee2-43fa-b576-42276bd49f61)

Sau đó finish và tích vào Open Project

tích chọn project sau đó mở terminal

![image](https://github.com/user-attachments/assets/a76efbd2-47a9-4f45-b560-a0c0cb3d08f7)


## Sử dụng Git


```
git branch
```

lệnh này hiển thị danh sách các nhánh đang hiện có. Nhánh đang làm việc sẽ được đánh bằng dấu *

![image](https://github.com/user-attachments/assets/3612e0e1-6a06-49c4-a86e-519b7174231e)

hiểu một cách đơn giản hơn là bạn đang xem code hôm 26-11

```
git branch -a
```
thêm cờ -a để hiển thị toàn bộ các branch hiện đang có trên remote và cả ở local


![image](https://github.com/user-attachments/assets/1a092058-8421-49c4-b014-4347fde6d319)

nếu lúc nãy không tích vào phần main thì sẽ không hiện dòng remotes/origin/main bởi vì không remote đến nhánh đấy. 

bây giờ khi muốn chuyển sang ngày 29-11 thì sử dụng lệnh sau

```
git checkout 29-11
```

Để nhìn rõ hơn sự khác nhau thì các bạn mở file Main.java 

![image](https://github.com/user-attachments/assets/d34fa0b2-3ff9-49aa-93e0-43be2cd91b12)

Sau đó enter lệnh trên

<img width="998" alt="image" src="https://github.com/user-attachments/assets/3f409ced-cf2e-4315-94b3-ccc44cd7024c">


Code thay đổi ngay lập tức, điều này làm cho quản lí code trong các dự án trở nên đơn giản và dễ dàng hơn. Khi mà mỗi một nhánh đại diện cho một chức năng độc lập với nhau trong một ứng dụng. Trong trường hợp này thì mình chỉ dùng để phân nhánh ra code của từng buổi học, còn để mà sử dụng git thành thạo thì mình nghĩ nên đi làm=))


## Lưu ý


Lí do mà mình checkout được sang nhánh khác là bởi vì ở nhánh hiện tại mình chưa từng sửa code hay build lại code, thì mình mới checkout được. Nếu đã sửa code mà vẫn muốn checkout được thì cần commit lại

![image](https://github.com/user-attachments/assets/15555a26-83a1-4c17-80e9-5b4a7d2815f6)


vì đang đứng ở thư mục java-app-console nên câu lệnh để add vào trạng thái stage là

```
git add ./src/Main/Main.java
```
![image](https://github.com/user-attachments/assets/d09649a4-c86a-45cf-a76a-8f2e550e2f5e)

```
git status
```
kiểm tra trạng thái

sau đó commit lại

```
git commit -m "thêm comment"
```

cờ -m có nghĩa là message, "thêm comment" là ghi chú cho lần thay đổi code đó

![image](https://github.com/user-attachments/assets/7e3af9dc-9b37-49a8-a395-0f2adfdebb4a)


ở đây khi commit thì git yêu cầu mình điền thông tin như email và tên của mình vào
để khi mà giả sử mình push code của mình lên repo của team, repo mà mình không sở hữu hoặc không được add vào repo thì điều này là cần thiết, kiểu như là cần danh tính vậy:)


```
git config --global user.email "abc@gmail.com"
```
```
git config --global user.name "test"
```
vì ở đây cũng không cần push code nên mình cũng chỉ để một cái mail ảo và cái tên giả.

![image](https://github.com/user-attachments/assets/7495bc60-b9e7-47db-8f61-a8e8417b0b05)

sau đó commit lại lần nữa và checkout

![image](https://github.com/user-attachments/assets/ea7f0abd-29a5-465c-b880-5846b6bcd463)


### Git pull

Khi nào mình up code mới thì chỉ gõ
```
git pull
```