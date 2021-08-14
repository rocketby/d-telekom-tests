### Hi there! :rocket:

#### This project contains automation tests of Web Site: https://deutschetelekomitsolutions.ru/

The following technologies are used here:

* :white_check_mark: **Java**  - OOP language, that was used for the automation tests development
* :white_check_mark: **Selenide** - framework for test automation powered by Selenium WebDriver
* :white_check_mark: **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* :white_check_mark: **Jenkins** - automation server, used to execute the tests with different parameters from GutHub repository on Selenoid
* :white_check_mark: **Allure Reports** - reporting tool for analysis of test execution results
* :white_check_mark: **Allure TestOps** - test management system for keeping test cases and graphs/metrics investigation
* :white_check_mark: **GitHub** - place for storing repository with code!
* :white_check_mark: **Telegram** - messenger, in which notifications about test execution results are sent!  

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


### After tests execution Allure Report is generated:

![image](https://user-images.githubusercontent.com/86851419/129453312-bf3cf433-bf47-41bf-9911-ad306e6b347d.png)

### Detailed report with test execution steps:

![image](https://user-images.githubusercontent.com/86851419/129453346-568cfcb4-877f-48df-b436-fd37322fc543.png)

### Notification with tests execution results in Telegram:

![image](https://user-images.githubusercontent.com/86851419/129453453-a6131f9c-ad5c-4fe4-949e-5b443ea83b06.png)



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
