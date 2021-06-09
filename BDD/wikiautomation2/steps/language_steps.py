from behave import given, when, then
from selenium import webdriver
from selenium.webdriver.chrome.webdriver import WebDriver

from poms.wiki_home_page import WikiHomePage

driver: WebDriver = webdriver.Chrome('C:\\Users\\AdamRanieri\\Desktop\\drivers\\chromedriver.exe')
wiki_home_page = WikiHomePage(driver)  # by creating a POM our code is leaner and easier to read


@given('The Guest is on the Wikipedia Home Page')
def open_up_wiki_home_page(context):
    driver.get('https://www.wikipedia.org/')


@when('The Guest clicks on English')
def click_on_engnlish(context):
    wiki_home_page.english().click()


@then('The Guest should be on the English Home Page')
def verify_on_enlish_page(context):
    title = driver.title  # returns the title of the web page
    assert title == 'Wikipedia, the free encyclopedia'


@when('The Guest clicks on Spanish')
def step_impl(context):
    wiki_home_page.spanish().click()


@then('The Guest should be on the Spanish Home Page')
def step_impl(context):
    title = driver.title  # returns the title of the web page
    assert title == 'Wikipedia, la enciclopedia libre'


@when('The Guest clicks on Italian')
def step_impl(context):
    wiki_home_page.italian().click()


@then('The Guest should be on the Italian Home Page')
def step_impl(context):
    title = driver.title  # returns the title of the web page
    assert title == "Wikipedia, l'enciclopedia libera"
