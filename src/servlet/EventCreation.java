package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Event;

/**
 * Servlet implementation class EventCreation
 */
@WebServlet("/EventCreation")
public class EventCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		//リクエストパラメータの取得(新規イベント作成）
		request.setCharacterEncoding("UTF-8");
		//イベントID
		String eventName = request.getParameter("eventName"); // イベント名
		String organizarName = request.getParameter("organizarName"); // 幹事の名前
		String eventVenueA = request.getParameter("eventVenue"); // 場所
		//String registDay = request.getParameter("registDay"); //投稿日時
		String autherName = request.getParameter("autherName"); // イベント製作者の名前
		String autherPass = request.getParameter("autherPass"); //イベント製作者の編集用パスワード
		String autherRemarkA = request.getParameter("autherRemark"); // イベント製作者の備考欄
		String eventOpenFlgaS = request.getParameter("eventOpenFlga"); // イベントの公開フラグ.1:公開,0:非公開
		String numberOfEvent = request.getParameter("numberOfEvent");//イベント会数
		String pricePerPersonA = request.getParameter("pricePerPerson"); // イベント一人当たりの料金

		String deadlineDayYear = request.getParameter("deadlineYear"); // 締切日　年
		String deadlineDayMonth = request.getParameter("deadlineDayMonth"); //締切日　月
		String deadlineDate = request.getParameter("deadlineDate"); //締切日　日
		String year = request.getParameter("year"); // 年 日程候補日
		String month = request.getParameter("month"); // 月　日程候補日
		String day = request.getParameter("day"); // 日　日程候補日
		String hour = request.getParameter("hour"); // 時間


		//イベントの場所
		ArrayList<String> eventVenue = new ArrayList<String>();
		eventVenue.add(eventVenueA);


		//イベント製作者の備考欄
		ArrayList<String> autherRemark = new ArrayList<String>();
		autherRemark.add(autherRemarkA);


		//イベント一人当たりの料金
		ArrayList<String> pricePerPerson = new ArrayList<String>();
		pricePerPerson.add(pricePerPersonA);


		//投稿日時
		Calendar  registDay = Calendar.getInstance();


		//締め切り日時
		Calendar deadlineDay = Calendar.getInstance();
		//eventPageFileName.set(2000, 1,1);


		//確定日時
		Calendar determinedDay =  Calendar.getInstance();


		//イベント確定のフラグ　１：確定　０：未確定
		int determinedFlag = 0;


		//イベント公開・非公開
		int eventOpenFlga = Integer.parseInt(eventOpenFlgaS);


		//URL
		String eventUrl = "NO DATA";


		//イベントページファイルの名前
		String eventPageFileName = (eventName);




		//Eventインスタンスの生成
		Event event = new Event(eventName, organizarName, eventVenue,
				 			registDay, autherName, autherPass, deadlineDay,
				 			autherRemark, determinedDay, determinedFlag, eventOpenFlga,
				 			numberOfEvent, eventUrl, eventPageFileName, pricePerPerson);



		//アプリケーションスコープに保存
		ServletContext application = this.getServletContext();
		application.setAttribute("event",event);



		//DAOの利用



		//フォワード(イベント作成決定後のページ）
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/eventConfirmed.jsp");
		dispatcher.forward(request, response);


	}


}