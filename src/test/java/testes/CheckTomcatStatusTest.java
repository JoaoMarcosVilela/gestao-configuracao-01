package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.CheckTomcatStatus;

public class CheckTomcatStatusTest {
	@Test
	public void testarUrl() {
		CheckTomcatStatus test = new CheckTomcatStatus();
		String url = "http://localhost:8080/project-webapp/index.jsp";
		assertEquals("Tomcat is running successfully. Status Code: 200", test.getTomcatStatus(url));
	}
}
