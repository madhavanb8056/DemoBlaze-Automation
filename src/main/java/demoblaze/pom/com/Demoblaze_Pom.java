package demoblaze.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoblaze_Pom {

	public WebDriver driver;

	@FindBy(xpath = "//a[@id=\"login2\"]")
	private WebElement login;

	@FindBy(xpath = "//input[@id=\"loginusername\"]")
	private WebElement username;

	@FindBy(xpath = "//input[@id=\"loginpassword\"]")
	private WebElement password;

	@FindBy(xpath = "//button[@onclick=\"logIn()\"]")
	private WebElement loginbutton;

	@FindBy(xpath = "(//a[.=\"Phones\"]")
	private WebElement phone;

	@FindBy(xpath = "//a[.=\"Laptops\"]")
	private WebElement laptops;

	@FindBy(xpath = "//a[.=\"Monitors\"]")
	private WebElement moniters;

	@FindBy(xpath = "//a[.=\"Nokia lumia 1520\"]")
	private WebElement nokia;

	@FindBy(xpath = "//a[.=\"Iphone 6 32gb\"]")
	private WebElement iphone;

	@FindBy(xpath = "//a[.=\"//a[.=\"Sony vaio i5\"]")
	private WebElement sonylap;

	@FindBy(xpath = "(//img[@class=\"card-img-top img-fluid\"])[1]")
	private WebElement samsungs7;

	@FindBy(xpath = "//a[.=\"Add to cart\"]")
	private WebElement addtocart;

	@FindBy(xpath = "//a[.=\"Cart\"]")
	private WebElement cart;

	@FindBy(xpath = "//a[.=\"Delete\"]")
	private WebElement delete;

	@FindBy(xpath = "//button[.=\"Place Order\"]")
	private WebElement placeorder;

	@FindBy(xpath = "//input[@id=\"name\"]")
	private WebElement name;

	@FindBy(xpath = "//input[@id=\"country\"]")
	private WebElement country;

	@FindBy(xpath = "//input[@id=\"city\"]")
	private WebElement city;

	@FindBy(xpath = "//input[@id=\"card\"]")
	private WebElement creditcard;

	@FindBy(xpath = "//input[@id=\"month\"]")
	private WebElement month;

	@FindBy(xpath = "//input[@id=\"year\"]")
	private WebElement year;

	@FindBy(xpath = "//button[@onclick=\"purchaseOrder()\"]")
	private WebElement purchase;

	@FindBy(xpath = "//button[.=\"OK\"]")
	private WebElement ok;

	@FindBy(xpath = "//a[.=\"Log out\"]")
	private WebElement logout;

	@FindBy(xpath = "//span[@class=\"carousel-control-next-icon\"]")
	private WebElement slide;

	public Demoblaze_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSlide() {
		return slide;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getLaptops() {
		return laptops;
	}

	public WebElement getMoniters() {
		return moniters;
	}

	public WebElement getNokia() {
		return nokia;
	}

	public WebElement getMacbook() {
		return iphone;
	}

	public WebElement getApplemoniter() {
		return sonylap;
	}

	public WebElement getSamsungs7() {
		return samsungs7;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPurchase() {
		return purchase;
	}

	public WebElement getOk() {
		return ok;
	}

	public WebElement getLogout() {
		return logout;
	}

}
