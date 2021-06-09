from behave import given, when, then
from selenium.webdriver.chrome.webdriver import WebDriver

@given('The Guest is on the Wikipedia Home Page')
def open_up_wiki_home_page(context):
    context.driver.get('https://www.wikipedia.org/')


@when('The Guest clicks on English')
def click_on_engnlish(context):
    context.wiki_home_page.english().click()


@then('The Guest should be on the English Home Page')
def verify_on_enlish_page(context):
    title = context.driver.title  # returns the title of the web page
    assert title == 'Wikipedia, the free encyclopedia'


@when('The Guest clicks on Spanish')
def step_impl(context):
    context.wiki_home_page.spanish().click()


@then('The Guest should be on the Spanish Home Page')
def step_impl(context):
    driver: WebDriver = context.driver  # create a type annotation for the intellisense
    title = driver.title  # returns the title of the web page
    assert title == 'Wikipedia, la enciclopedia libre'


@when('The Guest clicks on Italian')
def step_impl(context):
    context.wiki_home_page.italian().click()


@then('The Guest should be on the Italian Home Page')
def step_impl(context):
    title = context.driver.title  # returns the title of the web page
    assert title == "Wikipedia, l'enciclopedia libera"


@when('The Guest clicks on the search button')
def step_impl(context):
    context.wiki_home_page.search_button().click()


@when('The Guest types {word} into the search bar')
def step_impl(context, word: str):
    context.wiki_home_page.search_bar().send_keys(word)


@then(u'The title should be {title}')
def step_impl(context, title: str):
    assert context.driver.title == title
