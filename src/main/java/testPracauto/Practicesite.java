package testPracauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practicesite {
	public static WebDriver driver;		
		
		@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	 private WebElement dress;


	public Practicesite(WebDriver driver2) {
			PageFactory.initElements(driver2, this);
			this.driver = driver;
		}


	public WebElement getDress() {
		return dress;	
	}
	
	@FindBy(partialLinkText = "Evening")
     private WebElement even;
	
	public WebElement getEven() {
		return even;
	}

     
     @FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
      private WebElement im ;
     
     public WebElement getIm() {
 		return im;
 	}

     
     @FindBy(xpath = "//iframe[@vspace='0']")
     private WebElement sw;
     
     public WebElement getSw() {
 		return sw;
 	}
   
     @FindBy(xpath = "(//a[@data-field-qty='qty'])[2]")
     private WebElement adcart;


	public WebElement getAdcart() {
		return adcart;
	}
     
     @FindBy(id = "group_1")
     private WebElement si;


	public WebElement getSi() {
		return si;
	}
     
	@FindBy (name = "Pink")
	private WebElement col;


	public WebElement getCol() {
		return col;
	}
	
	@FindBy(name = "Submit")
	private WebElement sub;
	
	public WebElement getSub() {
		return sub;
	}

	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[2]")
	private WebElement pat;
	
	public WebElement getPat() {
		return pat;
	}
	
    public WebElement getSig() {
		return sig;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLog() {
		return log;
	}

	@FindBy(xpath = "(//i[@class = 'icon-chevron-right right'])[3]")
    private WebElement sig;
    
    @FindBy(id = "email")
    private WebElement mail;
    
    @FindBy (id = "passwd")
    private WebElement pass;
    
    @FindBy (id = "SubmitLogin")
    private WebElement log;
    
    public WebElement getPro1() {
		return pro1;
	}


	public WebElement getPro2() {
		return pro2;
	}


	public WebElement getPro3() {
		return pro3;
	}


	public WebElement getPro4() {
		return pro4;
	}


	public WebElement getPro5() {
		return pro5;
	}

	@FindBy (xpath =   "(//i[@class='icon-chevron-right right'])[7]")
    private WebElement pro1;
    
    @FindBy (id = "cgv")
    private WebElement pro2;
    
    @FindBy (xpath = "(//i[@class='icon-chevron-right right'])[3]")
    private WebElement pro3;
     
    @FindBy (xpath = "//a[@class='cheque']")
    private WebElement pro4;
     
    @FindBy (xpath = "(//i[@class='icon-chevron-right right'])[3]")
    private WebElement pro5;
    
     
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
