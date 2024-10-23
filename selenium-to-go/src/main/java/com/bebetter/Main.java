package com.bebetter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Câu lệnh này khai báo với máy ảo Java rằng có 1 Tool bên ngoài
        //tên là chromedriver.exe, sẽ được import vào trong máy ảo, với tên gọi webdriver.chrome.driver
        //Đây chính là cách 1 loạt các class nằm trong file chromedriver.exe
        //Sẽ được Selenium triệu gọi

        //Mở trình duyệt theo các options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--lang=en-GB"); //lingoes langcode: tìm mã quốc gia

        WebDriver myBrowser = new ChromeDriver();
        //Trình duyệt đã chạy lên, nhưng nó chỉ mở 1/2 màn hình

        myBrowser.manage().window().maximize();
        //Bung full màn hình trình duyệt
        myBrowser.get("https://www.google.com");
        //myBrowser chính là object đại diện cho trình duyệt đang mở
        //ta muốn bắt trình duyệt làm gì, ta gọi các method của nó tức là
        //myBrowser chấm cái hành động mà trình duyệt cần làm
        //VD: myBrowser.get(url); nghĩa là hãy mở trang url lên
        //myBrowser.findElementBy(tìm 1 tag trong trang web);
        //Ta cần học thêm kĩ thuật định vị 1 tag trong trình duyệt như tag Selector, Allocator,...
        //Ta hay dùng developer mode để định vị 1 thẻ trình duyệt, sau đó
        //đưa định vị này vào trong code (phím F12)

        WebElement searchBox = myBrowser.findElement(By.name("q"));
        //Ta đi định vị cái ô search qua name
        searchBox.sendKeys("Đam Mỹ Xuyên Không");
        searchBox.submit();
    }
}
