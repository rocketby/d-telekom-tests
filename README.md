Hi there! :wave:

This project contains automation tests of Web Site: **https://deutschetelekomitsolutions.ru/**

In this project the following technologies are used:

* **Java**  - OOP language, that was used for the automation tests development
* **Selenide** - framework for test automation powered by Selenium WebDriver
* **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* **Jenkins** - automation server, used to execute the tests with different parameters from GutHub repository on Selenoid
* **Allure TestOps** - test management system for keeping test cases and reporting about test results
* **GitHub** - place for storing repository with code!


Allure Report:

![image](https://user-images.githubusercontent.com/86851419/129453312-bf3cf433-bf47-41bf-9911-ad306e6b347d.png)

Detailed report with steps:

![image](https://user-images.githubusercontent.com/86851419/129453346-568cfcb4-877f-48df-b436-fd37322fc543.png)

Notification about tests execution results in special Telegram chat by created Bot:

![image](https://user-images.githubusercontent.com/86851419/129453453-a6131f9c-ad5c-4fe4-949e-5b443ea83b06.png)

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://xx:xx@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```
