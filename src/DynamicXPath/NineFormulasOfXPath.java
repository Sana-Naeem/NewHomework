package DynamicXPath;

public class NineFormulasOfXPath {
/*
Formula 1 (Single Attribute):
Source:
https://www2.hm.com/en_us/index.html 

Example 1: 
//a[@class='menu__hm'] (H&M Logo)
Example 2: 
//a[@class='menu__favorites'] (Favorites Button on top right corner)
Example 3: 
//button[@class='menu__search_submit'] (Magnifying glass icon next search products, top right)
Example 4: 
//a[@class='menu__bag goto-shopping-bag rollover-toggle'] (Shopping bag icon on top right corner)
Example 5:
 //a[@class='cta button'] (Title: Read H&M Magazine towards bottom of page)

Formula 2 (Multiple Attribute with ‘or’ logic):
Source:
https://www.costco.com/

Example 1: 
//a[@id='header_sign_in' or @class='myaccount'] (Sign in/Register button on top right corner)
Example 2: 
//a[@id='Home_Ancillary_8' or @class='nav-flyout'] (Membership button of header on top of page)
Example 3: 
//input[@id='search-field' or @name='keyword'] (Search bar on top of page)
Example 4: 
//a[@id='navigation-dropdown' or @class='nav-item'] (Shop Button on top left corner of header)
Example 5: 
//a[@id='country-select' or @class='header-menu-dropdown'] (US button on top right corner of page)


Formula 3 (Multiple Attribute with ‘and’ logic):
Source:
https://www.fedex.com/en-us/home.html
Example 1: 
//button[@class='fxg-button fxg-button--orange' and @id='btnSingleTrack'] (Track button on top of page)

Source: https://www.t-mobile.com/
Example 2:
//a[@class='nav__link ng-tns-c59-16' and @id='digital-header-nav-link-head-1'] (Phones and Devices button on header, top left corner)
Example 3:
//button[@id='user-links-dropdown' and @class='nav__link nav__link-button dropdown-toggles nav__link-button-desktop MAGENTA'] (My Account button on header, top right corner)
Example 4: 
//a[@class='ng-tns-c62-19 ng-star-inserted' and @id='digital-footer-category-name-11'] (About T-Mobile button, button right corner of page)
Example 5:
//a[@id='digital-footer-bottom-link-top-3' and @class='ng-star-inserted'] (Careers button on the footer, bottom of page)

Formula 4 (Tag with inner text [complete text]):
Source:
https://www.amazon.com/ref=nav_logo

Example 1: 
//a[text()='Customer Service'] (Customer Service Button on header, top left)
Example 2:
//a[text()='Shop Holiday Gifts'] (Shop Holiday Gifts button, in all gifts in one place carousel)
Example 3:
//div[text()='Get to Know Us'] (Get to Know Us button, bottom of page)
Example 4: 
//a[text()='Shop all deals'] (Shop all deals button, inside Deal of the day box)
Example 5:
//a[text()='Shop the Home Holiday Guide'] (Shop the Home Holiday Guide, inside Gifts for everyone on your list box)

Formula 5 (Tag with inner text [not actual text, means partial text as well as actual text]):
Source:
https://www.cnn.com/

Example 1: 
//h2[contains(text(),'How millions of Americans')] (partial text, title)
Example 2: 
//strong[contains(text(),'Canadians told to avoid nonessential international travel as Omicron spreads')] (complete text, title)
Example 3: 
//a[contains(text(),'Spor')] (partial text, sports button on footer)
Example 4: 
//span[contains(text(),'Live TV')] (complete text, header button on top right corner)
Example 5:
//h2[contains(text(),'podcasts')] (partial text, title, CNN Podcasts box)

Formula 6 (Tag with attributes and use of contains):
Source:
https://www.bestbuy.com/

Example 1: 
//img[contains(@class,'logo')] (Logo on top left corner)
Example 2: 
//span[contains(@class,'plButton-label v-ellipsis')] (Account button of header, top right)
Example 3:
//div[contains(@class,'pm-cta btn btn-sm btn-secondary')] (Shop Now button in apple shopping event box)
Example 4: 
//a[contains(@class,'action-message')] (Manage all your recently viewed items button, under Your Activity title)
Example 5:
//button[contains(@class,'c-button-link feedback-btn')] (Give feedback about our website button on footer, bottom of page)

Formula 7 (Normalize space- eliminates leading and trailing spaces):
Source:
https://www.expedia.com/

Example 1: 
//span[normalize-space(text())='Cars' and @class='uitk-tab-text'] (Cars button from header)
Example 2:
//button[normalize-space(text())='Search'] (Search button, Top of page)
Example 3: 
//a[normalize-space(text())='Spark your wanderlust' and contains(@class,'uitk-button uitk-button-large uitk-button-has-text uitk-button-primary uitk-spacing uitk-spacing-margin-block-three')] (Inside the box: Bucket list trips to take in 2022)
Example 4:
//a[normalize-space(text())='Discover new places and experiences'] (footer)
Example 5:
//span[normalize-space(text())='Cruises' and @class='uitk-tab-text'] (Cruises button, header)

Formula 8 (Starts with text):
Source:
https://www.montefiore.org/

Example 1:
//h3[starts-with(text(),'Future Perfect: Children’s Hospital at Montefiore Celebrates 20 Years')] (Heading, complete text)
Example 2: 
//h3[starts-with(text(),'COVID-19 Long-Haul')] (Heading, Partial text)
Example 3: 
//a[starts-with(text(),'Orthopedic Surgery')] (Complete Text, Under Featured Services Box)
Example 4:
//span[starts-with(text(),'Clinical')] (Partial text, Clinical Services Button in header)
Example 5:
//h3[starts-with(text(),'Locatio')] (Partial text, heading)

Formula 9 (Starts with attribute):
Source:
https://www.nypl.org/

Example 1: 
//a[starts-with(@id,'locationsTopLink')] (Locations button on header, top right)
Example 2:
//a[starts-with(@class,'navMenuItem-link')] (Research button, header)
Example 3:
//h1[starts-with(@class,'hpContentBanner-content-title')] (Introducing best books of 2021 title)
Example 4:
//a[starts-with(@id,'donateButton')] (Donate Button on header, top right)
Example 5:
//li[starts-with(@id,'tab-3')] (Other Events tab)


 */
}
