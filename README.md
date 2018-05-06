# FitNesse Demo

5914450039 วี

ใช้ FitNesse ในการทดสอบชุดคำสั่งที่เขียนด้วยภาษา Java

การทดลองนี้เป็นส่วนหนึ่งของวิชา [01418573 Software Testing](https://sites.google.com/a/ku.th/01418573/)

## เครื่องมือที่ใช้

- [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Docker CE](https://www.docker.com/community-edition)
- [docker-compose](https://docs.docker.com/compose/install) (หากใช้ Linux)
- [Git](https://git-scm.com/downloads)

## Start FitNesse Server

1. ดาวน์โหลดชุดคำสั่ง
    ```bash
    $ git clone https://github.com/weeix/fitnesse-demo.git
    $ cd fitnesse-demo
    ```
2. ดาวน์โหลด Docker image และสร้าง container
    ```bash
    $ docker-compose up
    ```

เมื่อเริ่มเห็น log ของ FitNesse แล้ว ทดลองเปิด http://localhost:8080 (หากใช้ Docker Toolbox ให้เปลี่ยนเป็นไอพีของ vm แทน)

## Build Code Under Test (CUT)

ใช้ IntelliJ IDEA หรือ IDE อื่น ๆ เปิดโฟลเดอร์ `CodeUnderTest` และ Build ตามปกติ ไฟล์ .class ใน `CodeUnderTest/target/classes` จะถูกลิงก์ไปยัง `/opt/fitnesse/Classes` ของ container