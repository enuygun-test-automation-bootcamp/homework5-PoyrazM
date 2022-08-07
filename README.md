## Appium Tests - Patika.dev & Enuygun Bootcamp Homework 5 

ContactManager.apk'sı kullanılarak Appium için verilen her bir test case için test otomasyonu yazım işlemleri yapılmıştır. Bütün Page , Test ve Set-Up kodları src/test/java ve src/test/resources altındadır. Tüm classlarda birim birim açıklamalar yapılmıştır.

### Test Cases
Otomasyonunu ve manuel testlerini yapmamız beklenen test caseler aşağıdaki gibidir.


```bash
#CASE-1#
User checks title whether it is "Add Contact"

#Case-2#
User adds a work account successfully
User checks required fields for add account page
User check the account whether it is correct

#Case-3#

User adds a mobile account successfully
User checks required fields for add account page
User check the account whether it is correct

#Case-4#
User adds a home acocunt successfully
User checks required fields for add account page
User check the account whether it is correct
User adds a home account with home email successfully

#Case-5#
User checks number limit for contact phone field

#Case-6#
User checks email format for contact email field

#Case-7#
User checks whether contact name accepts number and digit

#Case-8#
User checks special characters limit for contact phone field

#Case-9#
User checks speacial characters limit for contact name
```

### Cucumber Test Cases
Ödevde istenildiği gibi Cucumber Framework'u sadece test case'lerin yazımı için kullanılmıştır. O yüzden BaseRunner ve StepDefinitions tanımlanmamıştır. Verilen test case'ler aşağıdaki gibidir.

[validateAddContactTitle](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateAddContactTitle.feature)

[validateWorkAccount](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateWorkAccount.feature)

[validateMobileAccount.](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateMobileAccount.feature)

[validateHomeAccount](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateHomeAccount.feature)

[validateNumberLimitPhoneField](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateNumberLimitPhone.feature)

[validateNumberToNameField](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateNumberToName.feature)

[validateSpecialCharForEmail](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateSpecialCharForEmail.feature)

[validateSpecialCharForNameField](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateSpecialCharForName.feature)

[validateSpecialCharForNumberField](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/resources/features/validateSpecialCharForNumber.feature)



### TestNG Test Classes
Cucumber ile BDD formatında yazılan case'ler için TestNG notasyonları kullanılarak Test classları oluşturulmuştur.

[JsonCapabilityCheckTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/JsonValidateTestNG.java)

[ValidateAddContactTitleTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateAddContactTitleTestNG.java)

[ValidateWorkAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateWorkAccountTestNG.java)

[ValidateMobileAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateMobileAccountTestNG.java)

[ValidateHomeAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateHomeAccountTestNG.java)

[ValidateNumberLimitPhoneFieldTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateNumberLimitPhone.java)

[ValidateNumberToNameTextTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateNumberToNameTextTestNG.java)

[ValidateSpecialCharForEmailTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForEmailTestNG.java)

[ValidateSpecialCharForNameTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForNameTestNG.java)

[ValidateSpecialCharForNumberTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForNumberTestNG.java)

## Images for the Results
![1](https://user-images.githubusercontent.com/105527159/183265176-d6126287-2dd2-430c-8264-87c2aef0b76e.PNG)

![2](https://user-images.githubusercontent.com/105527159/183265210-b97a16a6-8c77-4743-a224-ea41b156ca1d.PNG)

![3](https://user-images.githubusercontent.com/105527159/183265221-d861c045-b77e-4eb1-b530-5106967fc3e4.PNG)

![4](https://user-images.githubusercontent.com/105527159/183265229-34af7e94-e539-4853-827f-c7c7d4f176f6.PNG)

![5](https://user-images.githubusercontent.com/105527159/183265235-789c3838-ee8d-4541-8510-e40adcf6b044.PNG)

![6](https://user-images.githubusercontent.com/105527159/183265240-e4ae0425-44d9-47dc-b0c7-60699a1c82e6.PNG)

![7](https://user-images.githubusercontent.com/105527159/183265247-3a3c4c53-0d9f-4cce-a639-ed9982f31ada.PNG)

![8](https://user-images.githubusercontent.com/105527159/183265269-a0baa34b-86f0-4faf-ab67-0e10c71c8091.PNG)

![9](https://user-images.githubusercontent.com/105527159/183265278-27d4cdb9-9814-43dc-bec6-d149de77697f.PNG)

![10](https://user-images.githubusercontent.com/105527159/183265316-bee1993c-1f21-4693-8f02-aea04b93a339.PNG)
