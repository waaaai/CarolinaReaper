package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Event  {
	//----------Fields----------
	private String  eventId;
	private String eventName;
	private ArrayList<String> organizarName;
	private ArrayList <String> eventVenue;
	private Calendar  registDay;
	private String autherName;
	private String autherPass;
	private Calendar deadlineDay;
    private ArrayList <String> autherRemark;
	private Calendar determinedDay ;
	private int determinedFlag;
	private int eventOpenFlga;
	private String numberOfEvent;
	private String eventUrl;
	private String eventPageFileName;
	private ArrayList<String> pricePerPerson;
	static int eventCounter=0;

	//----------Constructor----------
	public Event(String eventName, ArrayList<String> organizarName, ArrayList<String> eventVenue,
			Calendar registDay, String autherName, String autherPass, Calendar deadlineDay,
			ArrayList<String> autherRemark, Calendar determinedDay, int determinedFlag, int eventOpenFlga,
			String numberOfEvent, String eventUrl, String eventPageFileName, ArrayList<String> pricePerPerson) {
		super();
		this.eventId = String.valueOf(eventCounter);
		this.eventName = eventName;
		this.organizarName = organizarName;
		this.eventVenue = eventVenue;
		this.registDay = registDay;
		this.autherName = autherName;
		this.autherPass = autherPass;
		this.deadlineDay = deadlineDay;
		this.autherRemark = autherRemark;
		this.determinedDay = determinedDay;
		this.determinedFlag = determinedFlag;
		this.eventOpenFlga = eventOpenFlga;
		this.numberOfEvent = numberOfEvent;
		this.eventUrl = eventUrl;
		this.eventPageFileName = eventPageFileName;
		this.pricePerPerson = pricePerPerson;
		eventCounter++;
	}

	//----------Getter and Setter----------
	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public ArrayList<String> getOrganizarName() {
		return organizarName;
	}

	public void setOrganizarName(ArrayList<String> organizarName) {
		this.organizarName = organizarName;
	}

	public ArrayList<String> getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(ArrayList<String> eventVenue) {
		this.eventVenue = eventVenue;
	}

	public Calendar getRegistDay() {
		return registDay;
	}

	public void setRegistDay(int year,int month,int date,int hour, int minute ,int second ) {
		setYear(this.registDay ,year);
		setMonth(this.registDay ,month);
		setDate(this.registDay ,date);
		setHour(this.registDay ,hour);
		setMinute(this.registDay ,minute);
		setSecond(this.registDay ,second);
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public String getAutherPass() {
		return autherPass;
	}

	public void setAutherPass(String autherPass) {
		this.autherPass = autherPass;
	}

	public Calendar getDeadlineDay() {
		return deadlineDay;
	}

	public void setDeadlineDay(int year,int month,int date,int hour, int minute ,int second ) {
		setYear(this.deadlineDay ,year);
		setMonth(this.deadlineDay ,month);
		setDate(this.deadlineDay ,date);
		setHour(this.deadlineDay ,hour);
		setMinute(this.deadlineDay ,minute);
		setSecond(this.deadlineDay ,second);
	}

	public ArrayList<String> getAutherRemark() {
		return autherRemark;
	}

	public void setAutherRemark(ArrayList<String> autherRemark) {
		this.autherRemark = autherRemark;
	}

	public Calendar getDeterminedDay() {
		return determinedDay;
	}

	public void setDeterminedDay(int year,int month,int date,int hour, int minute ,int second ) {
		setYear(this.determinedDay ,year);
		setMonth(this.determinedDay ,month);
		setDate(this.determinedDay ,date);
		setHour(this.determinedDay ,hour);
		setMinute(this.determinedDay ,minute);
		setSecond(this.determinedDay ,second);
	}

	public int getDeterminedFlag() {
		return determinedFlag;
	}

	public void setDeterminedFlag(int determinedFlag) {
		this.determinedFlag = determinedFlag;
	}

	public int getEventOpenFlga() {
		return eventOpenFlga;
	}

	public void setEventOpenFlga(int eventOpenFlga) {
		this.eventOpenFlga = eventOpenFlga;
	}

	public String getNumberOfEvent() {
		return numberOfEvent;
	}

	public void setNumberOfEvent(String numberOfEvent) {
		this.numberOfEvent = numberOfEvent;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	public String getEventPageFileName() {
		return eventPageFileName;
	}

	public void setEventPageFileName(String eventPageFileName) {
		this.eventPageFileName = eventPageFileName;
	}

	public static int getEventCounter() {
		return eventCounter;
	}

	public static void setEventCounter(int eventCounter) {
		Event.eventCounter = eventCounter;
	}

	//----------instance methods----------
	public boolean isDeadlineDay(Calendar nowTime){
		nowTime=Calendar.getInstance();
		return deadlineDay.before(nowTime);
	}

	public boolean isAutherPassEquals(String key){
		if(autherPass == key) return true;
		else return false;
	}
	//----------static methods----------
	public static boolean isNotStrEnpty (String str){
		if(str!= null && str.length() != 0) return true;
		else return false;
	}
	public static boolean isFlagEquals(int n){
		if(n==1) return true;
		else return false;
	}

	public  static void setYear(Calendar cal,int n){
		if(n>0) cal.set(Calendar.YEAR, n);
		else cal.set(Calendar.YEAR, Calendar.YEAR);
	}

	public  static void setMonth(Calendar cal,int n){
		if(n>0) cal.set(Calendar.MONTH, n);
		else cal.set(Calendar.MONTH, Calendar.MONTH );
	}

	public  static void setDate(Calendar cal,int n){
		if(n>0) cal.set(Calendar.DATE, n);
		else cal.set(Calendar.DATE, Calendar.DATE);
	}

	public  static void setHour(Calendar cal,int n){
		if(n>0) cal.set(Calendar.HOUR, n);
		else cal.set(Calendar.HOUR, Calendar.HOUR);
	}

	public  static void setMinute(Calendar cal,int n){
		if(n>0) cal.set(Calendar.MINUTE, n);
		else cal.set(Calendar.MINUTE, Calendar.MINUTE);
	}

	public  static void setSecond(Calendar cal,int n){
		if(n>0) cal.set(Calendar.SECOND, n);
		else cal.set(Calendar.SECOND, Calendar.SECOND);
	}

}