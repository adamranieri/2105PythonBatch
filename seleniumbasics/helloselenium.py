from selenium import webdriver # module
from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.remote.webelement import WebElement # WebDriver class

driver: WebDriver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
driver.implicitly_wait(1)

# driver.get("https://www.google.com/")
# search_bar: WebElement = driver.find_element_by_name("q")
# search_bar.send_keys("Gears of War 3")
# search_button: WebElement = driver.find_element_by_name("btnK")
# search_button.click()

driver.get("https://orteil.dashnet.org/cookieclicker/")
cookie: WebElement = driver.find_element_by_id("bigCookie")

for x in range(1000):
    cookie.click()

driver.quit() # close the browser and shutdown the chromedriver