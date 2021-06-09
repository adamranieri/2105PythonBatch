from selenium import webdriver
from selenium.webdriver.chrome.webdriver import WebDriver

from poms.wiki_home_page import WikiHomePage

driver: WebDriver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
wiki_home_page = WikiHomePage(driver) # by creating a POM our code is leaner and easier to read

driver.get("https://www.wikipedia.org/")
wiki_home_page.spanish().click()
driver.get("https://www.wikipedia.org/")
wiki_home_page.italian().click()

driver.get("https://www.wikipedia.org/")
wiki_home_page.english().click()
driver.get("https://www.wikipedia.org/")
wiki_home_page.search_bar().send_keys("fallout")
wiki_home_page.search_button().click()

driver.quit()