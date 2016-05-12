package openapi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
@WebServlet(description = "openapiservlet", urlPatterns = { "/openapiservlet.do" })
public class openapiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Document document = Jsoup.connect("http://weather.naver.com/rgn/cityWetrMain.nhn").get();
		if (document != null){
			Elements elements = document.select("tbody > tr ");
			System.out.println(elements.size());
			System.out.println(elements.get(0));
		}
	}

}
