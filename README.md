### Hi there! :rocket:

### This project contains automation tests of Web Site: https://deutschetelekomitsolutions.ru/

The following technologies are used here:

* :white_check_mark: **Java**  - OOP language, that was used for the automation tests development
* :white_check_mark: **Selenide** - framework for test automation powered by Selenium WebDriver
* :white_check_mark: **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* :white_check_mark: **Jenkins** - automation server, used to execution of tests from GutHub repository on Selenoid
* :white_check_mark: **Allure Reports** - reporting tool for analysis of test execution results
* :white_check_mark: **Allure TestOps** - test management system for keeping test cases and graphs/metrics investigation
* :white_check_mark: **GitHub** - place for storing repository with code!
* :white_check_mark: **Telegram** - messenger, in which notifications about test execution results are sent!  

### USAGE examples

### For run remote tests need fill remote.properties or to pass value:
* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* threads (number of threads)


### Run tests using local browser:
```bash
gradle clean test
```

### Run tests using Selenoid:
```bash
gradle clean test -Durl=selenoid.autotests.cloud/wd/hub/ -DrunMode = remote
```

### Serve report:
```bash
allure serve build/allure-results
```


### Generated Allure Report with tests execution results:

![image](https://user-images.githubusercontent.com/86851419/129453312-bf3cf433-bf47-41bf-9911-ad306e6b347d.png)

### Detailed Allure report with test steps:

![image](https://user-images.githubusercontent.com/86851419/129453346-568cfcb4-877f-48df-b436-fd37322fc543.png)

### Notification with tests execution results in Telegram:

![image](https://user-images.githubusercontent.com/86851419/129453453-a6131f9c-ad5c-4fe4-949e-5b443ea83b06.png)

