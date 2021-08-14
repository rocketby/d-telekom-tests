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
![image](https://user-images.githubusercontent.com/86851419/129457545-054f3674-185d-4884-b4d2-a68d9b079d6c.png)

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
