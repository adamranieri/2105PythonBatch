from selenium import webdriver # module
from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.remote.webelement import WebElement # WebDriver class
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.webdriver.common.alert import Alert

driver: WebDriver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
driver.implicitly_wait(10) 

try:
    driver.get("file:///C:/Users/AdamRanieri/Desktop/Seleniumwaits/1000th.html")
    button: WebElement = driver.find_element_by_id("winBtn")
    button.click()
    alert = Alert(driver)
    print(alert.text)
    alert.accept()

finally:
    driver.quit() 