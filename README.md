### Hi there! :rocket:

### This project contains automation tests of Web Site: https://deutschetelekomitsolutions.ru/

The following technologies are used:

* :white_check_mark: **Java**  - OOP language, that was used for the automation tests development
* :white_check_mark: **Intellij Idea**  - integrated development environment (IDE) for developing computer software 
* :white_check_mark: **Selenide** - framework for test automation powered by Selenium WebDriver
* :white_check_mark: **Selenoid** - cross browser Selenium solution
* :white_check_mark: **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* :white_check_mark: **JUnit5**  - serves as a foundation for launching testing frameworks on the JVM
* :white_check_mark: **Jenkins** - automation server, used to execution of tests from GutHub repository on Selenoid
* :white_check_mark: **Allure Reports** - reporting tool for analysis of test execution results
* :white_check_mark: **Allure TestOps** - test management system for keeping test cases and graphs/metrics investigation
* :white_check_mark: **GitHub** - place for storing repository with code!
* :white_check_mark: **Telegram** - messenger, in which notifications about test execution results are sent!  

Java | Intellij Idea | Selenide | Selenoid | Gradle |
--- | --- | --- | --- | --- 
![image](https://user-images.githubusercontent.com/86851419/129460277-c5a848bf-9309-4743-bc8d-f64453bf439d.png) | ![image](https://user-images.githubusercontent.com/86851419/129460290-f0bb0b77-ced9-41d0-96e3-3b51e6e9c1c4.png) | ![image](https://user-images.githubusercontent.com/86851419/129460419-c463163c-0c76-46d6-9416-0ee4ec26b879.png) |![image](https://user-images.githubusercontent.com/86851419/129460507-e47ea71f-e8e0-4dfa-a5be-fa88bbd79522.png) | ![image](https://user-images.githubusercontent.com/86851419/129460392-4cf38fe7-9133-4a61-8423-1ae26e629d3e.png)
JUnit5 | Jenkins | Allure |GitHub | Telegram
![image](https://user-images.githubusercontent.com/86851419/129460565-68f2b13e-0f71-4510-9266-21c1bf95d55b.png)| ![image](https://user-images.githubusercontent.com/86851419/129460671-00864a0c-a1e9-415b-9df3-25062b4ee5ca.png) | ![image](https://user-images.githubusercontent.com/86851419/129460019-82755ea3-50b7-4d91-a5d0-f98430544079.png) | ![image](https://user-images.githubusercontent.com/86851419/129460698-8cbd73c0-b8a1-4c6a-a5e0-f8452e1bcb24.png) |![image](https://user-images.githubusercontent.com/86851419/129460847-d77a8a9d-0022-440f-b0f4-96dde9d22e58.png)

### USAGE examples

### For run remote tests need pass value:
* URL(default: selenoid.autotests.cloud/wd/hub/)
* ALLURE_NOTIFICATIONS_VERSION (default: 3.1.1)
* ENVIRONMENT (default: TEST)
* RUN_MODE (default: remote)
* BROWSER (default: chrome)
* BROWSER_VERSION (default: 91.0)
* BROWSER_SIZE (default: 1920x1080)
* BROWSER_MOBILE (mobile device name, for example iPhone X, default: not chosen)
* THREADS (number of threads, default: 5)


### Run tests using local browser:
```bash
gradle clean test
```

### Run tests using Selenoid:
```bash
gradle clean test -Durl=selenoid.autotests.cloud/wd/hub/ -DrunMode=remote
```

### Serve Allure report:
```bash
allure serve build/allure-results
```

### :gear: Running build in Jenkins with parameters:
![image](https://user-images.githubusercontent.com/86851419/129459453-b9fb76d8-9cda-41b4-81b3-68d2ca02f5ee.png)

### :chart_with_upwards_trend: Generated Allure Report with tests execution results:
![image](https://user-images.githubusercontent.com/86851419/129453312-bf3cf433-bf47-41bf-9911-ad306e6b347d.png)

### :bookmark_tabs: Detailed Allure report with test steps:
![image](https://user-images.githubusercontent.com/86851419/129457919-a9f4952f-b815-4d66-82ae-ee0937508b24.png)

### :bar_chart: Test runs in Allure TestOps:
![image](https://user-images.githubusercontent.com/86851419/129457654-e203b8f6-5c5c-4c59-93da-7bf72dc8a1ea.png)

### :clipboard: Test Cases in Allure TestOps:
![image](https://user-images.githubusercontent.com/86851419/129457999-02f33150-962b-4ed4-b254-14bf44b28947.png)

### :envelope_with_arrow: Notification about tests execution results in Telegram:
![image](https://user-images.githubusercontent.com/86851419/129457623-53affc03-3188-4ff8-ac63-8f7494feec1e.png)

### :film_projector: Recorded tests execution:
![alt text](https://github.com/rocketby/d-telekom-tests/blob/master/src/test/resources/video/test_execution_14082021.gif "Tests execution recorded")
