from selenium import webdriver # module
from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.remote.webelement import WebElement # WebDriver class
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By

import time
driver: WebDriver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
driver.implicitly_wait(10) # wait 10 seconds before throwing an error
# A MAXIUM WAIT time. if the element is found then it is not going to wait the full 10 seonds
# implicit waits are set once per driver

# waits are ways of telling selenium to wait on throwing an ERROR if it cannot find an element
# for a specific amount of time

try:
    driver.get("file:///C:/Users/AdamRanieri/Desktop/Seleniumwaits/slowpage.html")
    
    # worst way (sadly unavoidable or seen in bad code)
    # time.sleep(5) # makes your python code halt for 5 seconds
    #name_input: WebElement = driver.find_element_by_id("nameInput")

    #Explicit waits are used for specific elements
    # explicit waits are usually in your step implementations
    name_input: WebElement = WebDriverWait(driver,5).until(EC.presence_of_element_located((By.ID,"nameInput")))
    name_input.send_keys("Adam Ranieri")

finally:
    driver.quit() 