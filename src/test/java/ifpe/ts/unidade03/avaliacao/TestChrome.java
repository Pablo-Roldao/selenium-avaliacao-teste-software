package ifpe.ts.unidade03.avaliacao;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class TestChrome {

	static ChromeDriver chromeDriver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","/home/pablosantos/disciplinas-ifpe/ts/unidade03/selenium-webdrivers/chromedriver");
		chromeDriver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		chromeDriver.quit();
	}

	@Test
	void test() {
		chromeDriver.get("https://www.google.com/");
	}

}
