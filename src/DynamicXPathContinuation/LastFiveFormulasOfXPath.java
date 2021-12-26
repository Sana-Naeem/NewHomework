package DynamicXPathContinuation;

public class LastFiveFormulasOfXPath {

	/**
Formula 10: Tag with parents
Source: https://www.amazon.com/

Example1:
//span[@class='nav-line-2 nav-progressive-content']//parent::div[@id='glow-ingress-block'] (Select your address header)
Example2:
//span[@class='nav-cart-icon nav-sprite']//parent::div[@id='nav-cart-count-container'] (Cart icon, top right corner)
Example3:
//input[@id='nav-search-submit-button']//parent::span[@id='nav-search-submit-text'] (Magnifying glass by search bar)
Example4:
//span[@class='action-inner']//parent::a[@class='action-button'] (Sign in button on botton of page)
Example5:
//span[@class='navFooterBackToTopText']//parent::div[@class='navFooterBackToTop'] (Back to top footer)

Formula 11: Tag with child
Source: https://www.bestbuy.com/

Example1:
//button[@class='c-button-unstyled plButton orderStatus-button']//child::span[@class='plButton-label'] (Order status button on header)
Example2:
//div[@class='feedback-link-container']//child::button[@class='c-button-link feedback-btn'] (Give feedback about our website link on bottom page)
Example3:
//a[@class='icon-navigation-link']//child::div[@class='icon-navigation-link-icon'] (Visit our support center icon)
Example4:
//div[@class='marketing-navigation']//child::a[@class='sign-in'] (Sign in or create an account link on bottom of page, right side)
Example5:
//form[@class='search-bar input-field']//child::input[@id='gh-search-input'] (Search bar on top of page)

Formula 12: Tag with following sibling {younger brother}
Source: https://www.mountsinai.org/

Example1:
//a[@class='hidden-xs dropdown']//following-sibling::a[@class='visible-xs dropdown'] (About Us button on header)
Example2:
//a[@id='hploc__sel-text-hosp']//following-sibling::div[@class='dropdown-menu white-bg'] (Select drop down in choose a location box)
Example3:
//a[@class='hidden-xs dropdown']//following-sibling::a[@class='visible-xs dropdown'] (Patient care button on header)
Example 4:
//a[@class='stat-circle']//following-sibling::div[@class='carousel-caption'] (Over 42,000 Employees button towards bottom of page)

Formula 13: Tag with preceding sibling {elder brother}
Source: https://www.costco.com/

Example1:
//p[@class='copyright']//preceding-sibling::ul[@class='social hidden-xl'] (copyright information text on bottom of page: “© 1998 — 2021 Costco Wholesale Corporation. All rights reserved”)
Example2:
//div[@class='nav-item']//preceding-sibling::script[@id='Home_Ancillary_Popover_3'] (Pharmacy button on header)
Example3:
//li[@class='list-group-item']//preceding-sibling::a[@class='myaccount'] (Orders & Returns button)

Formula 14: Tag with inner text/attribute (if multiple is present)
Source:

Example1:
(//a[text()='Best Buy Totaltech'])[1] (Best But Total Tech Button on header)
Example2:
(//span[text()='Account'])[1] (Account button on header)
Example3:
(//span[text()='Cart'])[1] (Cart icon on header)
Example4:
(//button[text()='Sign Up'])[1] (Sign up button on bottom of page, right side)
Example5:
(//a[text()='Shop Now'])[1] (Shop now button in deal of the day box)






	 */
}
