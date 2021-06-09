from behave.runner import Context
from selenium import webdriver
from selenium.webdriver.chrome.webdriver import WebDriver
from poms.wiki_home_page import WikiHomePage
# Environment  is like a configuration for your cucumber tests
# it is actual python code

# the context object passed into our step implementations and environment set up and tear down functions
# is SHARED between every function
# context is a singleton (there is only ONE context object for the entirety of the program)
# context is the primary way to share information or objects in you code
def before_all(context: Context):
    ## ideally you attach the web driver for the applicaiton to the context object
    context.driver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
    context.wiki_home_page = WikiHomePage(context.driver)
    print("I run before ANY scenarios")

def after_all(context):
    print("I run after all scenarios")
    context.driver.quit()
