from selenium.webdriver.chrome.webdriver import WebDriver

# Page Object Model
# A class that will contain the important elements on a web page
from selenium.webdriver.remote.webelement import WebElement


class WikiHomePage:

    def __init__(self, driver: WebDriver):
        self.driver = driver #Dependency injection of a driver into the web page

    # Selectors are the different ways to get elements in selenium
    def english(self):
        element: WebElement = self.driver.find_element_by_id("js-link-box-en") # get element by id
        return element

    def spanish(self):
        # CSS selector is a great choice if name or id is unavailbe
        element: WebElement = self.driver.find_element_by_css_selector('div[lang="es"]')
        return element

    def italian(self):
        # xpath should a more last resort way of getting elements
        # xpath is the HTML directions to a element
        # relative xpaths are better //*[@id="www-wikipedia-org"]/div[2]/div[8]
        # absolute xpath /html/body/div[2]/div[8]
        element: WebElement = self.driver.find_element_by_xpath('//*[@id="www-wikipedia-org"]/div[2]/div[8]')
        return element

    def search_bar(self):
        element: WebElement = self.driver.find_element_by_name("search")
        return  element

    def search_button(self):
        element: WebElement = self.driver.find_element_by_class_name("pure-button-primary-progressive")
        return  element

