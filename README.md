## Appium Tests - Patika.dev & Enuygun Bootcamp Homework 5 

Appium için verilen her bir test case için test otomasyonu yazım işlemleri yapılmıştır.

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
Ödevde Cucumber Framework'u sadece test case'lerin yazımı için kullanılmıştır. O yüzden BaseRunner ve StepDefinitions tanımlanmamıştır. Verilen test case'ler aşağıdaki gibidir.

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
Cucumber ile BDD formatında yazılan case'ler için TestNG anatasyonları kullanılarak Test classları oluşturulmuştur.

[JsonCapabilityCheck](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/JsonValidateTestNG.java)

[ValidateAddContactTitleTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateAddContactTitleTestNG.java)

[ValidateWorkAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateWorkAccountTestNG.java)

[ValidateMobileAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateMobileAccountTestNG.java)

[ValidateHomeAccountTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateHomeAccountTestNG.java)

[ValidateNumberLimitPhoneField](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateNumberLimitPhone.java)

[ValidateNumberToNameTextTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateNumberToNameTextTestNG.java)

[ValidateSpecialCharForEmailTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForEmailTestNG.java)

[ValidateSpecialCharForNameTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForNameTestNG.java)

[ValidateSpecialCharForNumberTestNG](https://github.com/enuygun-test-automation-bootcamp/homework5-PoyrazM/blob/main/src/test/java/tests/ValidateSpecialCharForNumberTestNG.java)


